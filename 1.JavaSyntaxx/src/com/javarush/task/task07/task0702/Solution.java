package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] s = new String[10];
        for(int i = 0; i < s.length - 2; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            s[i] = reader.readLine();
        }
        for (int i = 9; i >= 0; i--){
            System.out.println(s[i]);
        }
    }
}