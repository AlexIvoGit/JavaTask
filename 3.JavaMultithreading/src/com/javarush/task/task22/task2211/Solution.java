package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];

        try (FileInputStream inputStream = new FileInputStream(fileName1);
             FileOutputStream outputStream = new FileOutputStream(fileName2)) {
            byte[] buffer = new byte[inputStream.available()];
            while (inputStream.available() > 0) {
                inputStream.read(buffer);
            }
            Charset utf8 = Charset.forName("UTF-8");
            Charset windows1251 = Charset.forName("Windows-1251");
            String result = new String(buffer, windows1251);
            buffer = result.getBytes(utf8);
            outputStream.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
