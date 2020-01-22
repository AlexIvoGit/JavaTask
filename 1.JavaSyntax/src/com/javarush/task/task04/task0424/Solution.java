package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sN1 = reader.readLine();
        String sN2 = reader.readLine();
        String sN3 = reader.readLine();

        int n1 = Integer.parseInt(sN1);
        int n2 = Integer.parseInt(sN2);
        int n3 = Integer.parseInt(sN3);

        if (n1 != n2 && n1 != n3 && n2 != n3) {
        } else if (n1 != n2 && n1 != n3) {
            System.out.println("1");
        } else if (n2 != n1) {
            System.out.println("2");
        } else if (n3 != n1 & n3 != n2) {
            System.out.println("3");
        } else {
        }

    }
}
