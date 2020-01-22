package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        if (N > 0){
            int maximum = Integer.parseInt(reader.readLine());
        if (N > 0 ){
            for (int i = 0; i < N - 1; i++) {
                int number = Integer.parseInt(reader.readLine());
                if (number > maximum) maximum = number;
            }
        }
        if (maximum != 0){System.out.println(maximum);}}
    }
}
