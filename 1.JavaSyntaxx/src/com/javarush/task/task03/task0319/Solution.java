package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String nS = reader.readLine();
        String nS2 = reader.readLine();
        int n1 = Integer.parseInt(nS);
        int n2 = Integer.parseInt(nS2);

        System.out.println(s + " получает " + n1 + " через " + n2 + " лет.");

    }
}
