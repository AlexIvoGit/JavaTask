package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);

        switch (args[0]) {
            case "-e":
                while (inputStream.available() > 0) {
                    int i = inputStream.read() + 1;
                    outputStream.write(i);
                }

            case "-d":
                while (inputStream.available() > 0) {
                    int i = inputStream.read() - 1;
                    outputStream.write(i);
                }
        }
        inputStream.close();
        outputStream.close();
    }

}
