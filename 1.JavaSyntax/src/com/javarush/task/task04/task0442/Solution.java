package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i2 = 0;
        while (true) {
            int i = Integer.parseInt(reader.readLine());
            i2 += i;
            //System.out.println(i2);
            if (i == -1) {
                break;
            }
        }
        System.out.println(i2);
    }
}
