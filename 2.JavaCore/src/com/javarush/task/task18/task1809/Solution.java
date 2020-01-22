package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(bufferedReader.readLine());
        FileOutputStream file2 = new FileOutputStream(bufferedReader.readLine());
        int[] list = new int[file1.available()];

        for (int i = 0; file1.available() > 0; i++) {
            list[i] = file1.read();
        }
        file1.close();
        for (int i = list.length - 1; i >= 0; i--) {
            file2.write(list[i]);
        }
        file2.close();


    }
}
