package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String[] list = string.split(" ");
        for (int i = 0; i < list.length; i++) {
            if (list[i].length() < 1) {
            } else {
                String s1 = list[i].substring(0, 1).toUpperCase();
                String s2 = list[i].substring(1);
                System.out.print(s1 + s2 + " ");
            }
        }
        /*for (String ss : list) {
            System.out.println(ss);
        }*/
    }
}
