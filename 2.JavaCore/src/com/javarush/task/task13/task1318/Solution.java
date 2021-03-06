package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String link = reader.readLine();
        InputStream inStream = new FileInputStream(link);
        while (inStream.available() > 0){
            int data = inStream.read();
            char c = (char) data;
            System.out.print(c);
        }
        inStream.close();
        reader.close();
    }
}