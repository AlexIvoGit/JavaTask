package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileReader fileReader = new FileReader(fileName);
        TreeMap<String, Double> map = new TreeMap<>();
        StringBuilder line = new StringBuilder();
        while (fileReader.ready()) {
            line.append((char) fileReader.read());
        }
        fileReader.close();
        String[] strings = line.toString().split("\\n");
        for (String ss : strings){
            String[] strings1 = ss.split(" ");
            String lastName = strings1[0];
            double d = Double.parseDouble(strings1[1]);
            if (map.isEmpty()) {
                map.put(lastName, d);
            } else {
                map.merge(lastName, d, Double::sum);
            }
        }
            for (Map.Entry m : map.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
    }
}
