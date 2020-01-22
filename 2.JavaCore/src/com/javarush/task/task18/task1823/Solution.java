package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) {
                break;
            } else {
                new ReadThread(s).start();
            }
        }
    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) throws IOException {
            this.fileName = fileName;
        }

        public void run() {
            try {
                FileInputStream inputStream = new FileInputStream(this.fileName);
                byte[] bytes = new byte[inputStream.available()];
                while (inputStream.available() > 0) {
                    inputStream.read(bytes);
                }
                int count = 0;
                int count2 = 0;
                int symbols = 0;
                for (Byte b : bytes) {
                    count2 = 0;

                    for (int i = 0; i < bytes.length; i++) {
                        if (b == bytes[i]) {
                            count2++;
                        }
                        if (count2 > count) {
                            count = count2;
                            symbols = b;
                        }
                    }
                }
                inputStream.close();
                resultMap.put(fileName, symbols);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
