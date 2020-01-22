package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = reader.readLine();
        int year = Integer.parseInt(sYear);
        int x = 0;

        if (year % 400 == 0){
            x = 366;
        } else if (year % 100 == 0){
            x = 365;
        } else if (year % 4 == 0){
            x = 366;
        } else {
            x = 365;
        }

        System.out.println("количество дней в году: " + x);



    }
}