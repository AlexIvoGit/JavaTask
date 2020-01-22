package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[15];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < num.length; i = i + 2) {
            even = even + num[i];
        }
        for (int i = 1; i < num.length; i = i + 2) {
            odd = odd + num[i];
        }
        if (even > odd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }


    }
}
