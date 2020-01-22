package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String index1 = reader.readLine();
            if (index1.isEmpty()) {
                break;
            } else {
                String name = reader.readLine();
                int index = Integer.parseInt(index1);
                map.put(name, index);
            }
        }


        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            int index = pair.getValue();
            String name = pair.getKey();
            System.out.println(index + " "  + name);
        }
    }
}
