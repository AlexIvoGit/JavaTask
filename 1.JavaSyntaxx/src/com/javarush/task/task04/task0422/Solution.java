package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sNum = reader.readLine();
        int num = Integer.parseInt(sNum);

        if (num < 18 && num > 0){
            System.out.println("Подрасти еще");
        }

    }
}
