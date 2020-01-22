package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        char[] arr = new char[52];
        String alphavit = "AEIOUYBCDFGHJKLMNPQRSTVWXYZ";
        arr = alphavit.toCharArray();
        int count = 0;

        while (fileInputStream.available() > 0) {
            int i = fileInputStream.read();
            if (alphavit.indexOf(i) != -1 || alphavit.toLowerCase().indexOf(i) != -1) {
                count++;
            }
        }
        fileInputStream.close();
        System.out.println(count);
    }
}
