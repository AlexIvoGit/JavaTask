package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        if(n==0){
            System.out.println("ноль");
        } else if (n % 2 == 0 && n > 0){
            System.out.println("положительное четное число");
        } else if (n % 2 == 0 && n < 0){
            System.out.println("отрицательное четное число");
        } else if (n % 2 != 0 && n > 0){
            System.out.println("положительное нечетное число");
        } else if (n % 2 != 0 && n < 0){
            System.out.println("отрицательное нечетное число");
        }

    }
}
