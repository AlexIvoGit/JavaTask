package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] list1 = new int[10];
        for (int i = 0; i < list1.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            list1[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = list1.length - 1 ; i >= 0; i--){
            System.out.println(list1[i]);
        }
    }
}

