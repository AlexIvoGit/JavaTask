package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = new String[10];
        int[] num = new int[10];

        for(int i = 0; i < s.length; i++){
            s[i] = reader.readLine();
        }
        for(int i = 0; i < num.length; i++){
            num[i] = s[i].length();
        }
        for (int num2:num) {
            System.out.println(num2);
        }
    }
}
