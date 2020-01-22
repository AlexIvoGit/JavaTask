package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
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
        for (String ss : strings) {
            String[] strings1 = ss.split(" ");
            String lastName = strings1[0];
            double d = Double.parseDouble(strings1[1]);
            if (map.isEmpty()) {
                map.put(lastName, d);
            } else {
                map.merge(lastName, d, Double::sum);
            }
        }
        ArrayList<Double> max = new ArrayList<>();
        for (Map.Entry<String, Double> m : map.entrySet()) {
            max.add(m.getValue());
        }
        double i = Collections.max(max);
        for (Map.Entry<String, Double> m : map.entrySet()) {
            if (m.getValue() == i) {
                System.out.println(m.getKey());
            }
        }
    }
}
