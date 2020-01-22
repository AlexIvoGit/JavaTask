package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int countMin = 0;
        int countPlus = 0;

        if (a > 0 && a != 0){countPlus++;}
        if (a < 0 && a != 0){countMin++;}

        if (b > 0 && b != 0){countPlus++;}
        if (b < 0 && b != 0){countMin++;}

        if (c > 0 && c != 0){countPlus++;}
        if (c < 0 && c != 0){countMin++;}

        System.out.println("количество отрицательных чисел: " + countMin);
        System.out.println("количество положительных чисел: " + countPlus);

    }
}
