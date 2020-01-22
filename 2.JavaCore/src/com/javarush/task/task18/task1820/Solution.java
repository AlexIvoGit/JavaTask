package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
        String ss = "";
        String[] strings;

        while (fileInputStream.available() > 0) {
            int i = fileInputStream.read();
            ss += (char) i;
        }
        strings = ss.split(" ");
        Double[] doubles = new Double[strings.length];
        Integer[] integers = new Integer[doubles.length];
        for (int i = 0; i < strings.length; i++) {
            doubles[i] = Double.parseDouble(strings[i]);
        }
        String stringInt = "";
        for (int i = 0; i < doubles.length; i++) {
            integers[i] = Math.toIntExact(Math.round(doubles[i]));
            stringInt += integers[i] + " ";
        }
        System.out.println(stringInt);
        fileOutputStream.write(stringInt.getBytes());
        fileInputStream.close();
        fileOutputStream.close();

    }
}
