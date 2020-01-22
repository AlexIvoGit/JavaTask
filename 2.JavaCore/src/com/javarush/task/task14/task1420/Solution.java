package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int nOD(int a, int b) {
        int min;
        int n = 1;
        if (a < b) min = a;
        else min = b;
        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                n = i;
                break;
            }
        }
        return n;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x1 = Integer.parseInt(reader.readLine());
        int x2 = Integer.parseInt(reader.readLine());
        if (x1 <= 0 || x2 <= 0){
            throw new Exception();
        }
        reader.close();
        System.out.println(nOD(x1,x2));


    }
}





