package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int number = Integer.parseInt(num);

        if(number > 0){
            number = number + number;
        }if (number < 0){
            number += 1;
        }if (number == 0){
            number = 0;
        }
        System.out.println(number);

    }

}