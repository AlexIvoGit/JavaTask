package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum1 = reader.readLine();
        String sNum2 = reader.readLine();
        String sNum3 = reader.readLine();
        String sNum4 = reader.readLine();

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
        int num3 = Integer.parseInt(sNum3);
        int num4 = Integer.parseInt(sNum4);

        if (num1 >= num2 && num1 >= num3 && num1 >= num4){
            System.out.println(num1);
        } else if (num2 >= num3 && num2 >= num4 && num2 >= num1){
            System.out.println(num2);
        } else if (num3 >= num1 && num3 >= num2 && num3 >= num4){
            System.out.println(num3);
        } else if (num4 >= num1 && num4 >= num2 && num4 >= num3){
            System.out.println(num4);
        }

    }
}
