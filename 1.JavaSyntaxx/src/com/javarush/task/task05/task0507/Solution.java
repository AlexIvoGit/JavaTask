package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double i = 0;
        double count = 0;
        double s = 0;

        while (true) {
            i = Double.parseDouble(reader.readLine());
            if (i == -1){
                break;
            } else {
                count++;
                s = s + i;
            }

        }
            double med = (s) / count;
        System.out.println(med);
    }

}


