package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[20];
        int[] num2 = new int[10];
        int[] num3 = new int[10];
        for(int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(reader.readLine());
        }
        for(int i = 0, j = 10; i < num2.length; i++, j++ ){
            num2[i] = num[i];
            num3[i] = num[j];
        }
        for (int q:num3) {
            System.out.println(q);

        }
    }
}
