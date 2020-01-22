package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        Map<Integer, Integer> map = new HashMap<>();
        while (fileInputStream.available() > 0) {
            int i = 0;
            int a = fileInputStream.read();
            map.put(a, i);
            i++;
        }
        fileInputStream.close();
        ArrayList<Integer> arrayList = new ArrayList();

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            arrayList.add(m.getKey());
        }
        Collections.sort(arrayList);
        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }

    }
}
