package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum1 = reader.readLine();
        String sNum2 = reader.readLine();

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);

        if (num1 >= num2){
            System.out.println(num2);
        } else {
            System.out.println(num1);
        }

    }
}