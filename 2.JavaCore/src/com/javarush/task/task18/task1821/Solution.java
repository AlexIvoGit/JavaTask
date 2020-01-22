package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (fileInputStream.available() > 0) {
            int i = fileInputStream.read();
            if (i > 0 && i < 128) {
                map.merge(i, 1, Integer::sum);
            }
        }
        for (Map.Entry map1 : map.entrySet()) {
            int i = (int) map1.getKey();
            System.out.println((char) i + " " + map1.getValue());
        }
        fileInputStream.close();

    }
}

