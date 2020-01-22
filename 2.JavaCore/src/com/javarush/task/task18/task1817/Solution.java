package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        double countSpace = 0;
        double countSymbols = 0;
        while (fileInputStream.available() > 0) {
            int i = fileInputStream.read();
            if (i == 32) {
                countSpace++;
            } else {
                countSymbols++;
            }
        }
        fileInputStream.close();
        double total = (countSpace / (countSpace + countSymbols)) * 100;
        double newDouble = new BigDecimal(total).setScale(2, RoundingMode.UP).doubleValue();
        System.out.println(newDouble);
    }
}
