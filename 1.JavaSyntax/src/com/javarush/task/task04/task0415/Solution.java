package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();

        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);

        if ((a + b) <= c || (b + c) <= a || (a + c) <= b){
            System.out.println("Треугольник не существует.");
        }else {
            System.out.println("Треугольник существует.");
        }

    }
}