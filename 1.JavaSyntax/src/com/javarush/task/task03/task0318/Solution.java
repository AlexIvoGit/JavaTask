package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String age = reader.readLine();
        String name = reader.readLine();

        int iAge = Integer.parseInt(age);

        System.out.println(name + " захватит мир через " + iAge + " лет. Му-ха-ха!");

    }
}
