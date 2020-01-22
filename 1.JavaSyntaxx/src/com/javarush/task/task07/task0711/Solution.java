package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0, j = strings.size() - 1; i < 13; i++) {
            String s = strings.get(j);
            strings.remove(j);
            strings.add(0,s);

        }
        for (String s1 : strings) {
                   System.out.println(s1);
               }
    }
}
