package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum1 = reader.readLine();
        String sNum2 = reader.readLine();
        String sNum3 = reader.readLine();

        int n1 = Integer.parseInt(sNum1);
        int n2 = Integer.parseInt(sNum2);
        int n3 = Integer.parseInt(sNum3);

        if (n1 >= n2 && n2 >= n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        } else if (n2 >= n3 && n3 >= n1){
            System.out.println(n2 + " " + n3 + " " + n1);
        } else if (n1 >= n3 && n3 >= n2){
            System.out.println(n1 + " " + n3 + " " + n2);
        } else if (n3 >= n1 && n1 >= n2){
            System.out.println(n3 + " " + n1 + " " + n2);
        } else if (n3 >= n2 && n2 >= n1){
            System.out.println(n3 + " " + n2 + " " + n1);
        } else if (n2 >= n1 && n1 >= n3){
            System.out.println(n2 + " " + n1 + " " + n3);
        }

    }
}

