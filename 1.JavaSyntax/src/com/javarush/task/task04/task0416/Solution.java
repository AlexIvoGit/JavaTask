package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        double num = Double.parseDouble(sNum);
        if (num % 5.0 < 3.0 && num % 5.0 >= 0.0) {
            System.out.println("зелёный");
        }
        if (num % 5.0 < 4.0 && num % 5.0 >= 3.0) {
            System.out.println("жёлтый");
        }
        if (num % 5.0 < 5.0 && num % 5 >= 4.0) {
            System.out.println("красный");
        }
    }
}



