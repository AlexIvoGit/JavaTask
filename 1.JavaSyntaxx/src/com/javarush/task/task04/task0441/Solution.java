package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int min1 = Math.min(a, b);
        int min2 = Math.min(b, c);
        int min = Math.min(min1, min2);

        int max1 = Math.max(a, b);
        int max2 = Math.max(b, c);
        int max = Math.max(max1, max2);

        int mid = (a + b + c) - max - min;

        if (a == b && b == c) {
            System.out.println(a);
        } else {
            System.out.println(mid);
        }

    }
}