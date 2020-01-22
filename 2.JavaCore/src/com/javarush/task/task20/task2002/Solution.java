package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //
            User user1 = new User();
            user1.setFirstName("Ivan");
            user1.setLastName("Ivanov");
            user1.setBirthDate(new java.util.Date());
            user1.setMale(true);
            user1.setCountry(User.Country.UKRAINE);
            javaRush.users.add(user1);
            //
            User user2 = new User();
            user2.setFirstName("Petr");
            user2.setLastName("Petrov");
            user2.setBirthDate(new java.util.Date());
            user2.setMale(true);
            user2.setCountry(User.Country.RUSSIA);
            javaRush.users.add(user2);
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            String isUsers = users != null ? "yes" : "no";
            PrintWriter writer = new PrintWriter(outputStream);
            writer.println(isUsers);
            writer.flush();

            if (users != null) {
                for (User user : users) {
                    writer.println(user.getFirstName());
                    writer.println(user.getLastName());
                    long bd = user.getBirthDate().getTime();
                    writer.println(bd);
                    writer.println(user.isMale());
                    writer.println(user.getCountry().toString());

                }
            }
            writer.flush();
            writer.close();

        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String isUsers = bufferedReader.readLine();
            if (isUsers.equals("yes")) {
                while (bufferedReader.ready()) {
                    User user = new User();
                    user.setFirstName(bufferedReader.readLine());
                    user.setLastName(bufferedReader.readLine());
                    user.setBirthDate(new Date(Long.parseLong(bufferedReader.readLine())));
                    user.setMale(Boolean.parseBoolean(bufferedReader.readLine()));
                    user.setCountry(User.Country.valueOf(bufferedReader.readLine()));

                    this.users.add(user);

                }

            }
            bufferedReader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
