package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void sendBroadcastMessage(Message message) {
        for (Connection connection : connectionMap.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                System.out.println("Сообщение не отправлено");
            }
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            String result = "";
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message messageName = connection.receive();
                result = messageName.getData();
                if (messageName.getType() != MessageType.USER_NAME) {
                    continue;
                } else if (messageName.getType() == MessageType.USER_NAME && !messageName.getData().isEmpty()) {
                    if (connectionMap.containsKey(messageName.getData())) {
                        continue;
                    } else {
                        connectionMap.put(messageName.getData(), connection);
                        connection.send(new Message(MessageType.NAME_ACCEPTED));
                        break;
                    }
                }
            }
            return result;
        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            for (Map.Entry<String, Connection> connectionEntry : connectionMap.entrySet()) {
                if (!connectionEntry.getKey().equals(userName)) {
                    Message message = new Message(MessageType.USER_ADDED, connectionEntry.getKey());
                    connection.send(message);
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message receive = connection.receive();
                if (receive.getType() == MessageType.TEXT) {
                    String message = String.format("%s: %s", userName, receive.getData());
                    sendBroadcastMessage(new Message(MessageType.TEXT, message));
                } else {
                    ConsoleHelper.writeMessage("Данные не корректны");
                }
            }
        }

        @Override
        public void run() {
            ConsoleHelper.writeMessage(String.format("Установлено новое соединение с удаленным адресом: %s", socket.getRemoteSocketAddress()));
            Connection connection;
            String userName;
            try {
                connection = new Connection(socket);
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);
                connectionMap.remove(userName);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        int port = ConsoleHelper.readInt();
        ServerSocket server = null;
        Socket clientSocket = null;
        try {
            server = new ServerSocket(port);
            System.out.println("Сервер запущен");
            while (true) {
                clientSocket = server.accept();
                Handler handler = new Handler(clientSocket);
                handler.start();
            }
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            System.out.println("Сервер закрыт");
            try {
                server.close();
                clientSocket.close();
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }
}
