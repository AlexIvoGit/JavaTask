package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        reader.close();

        FileOutputStream outputStream1 = new FileOutputStream(fileName1, true);
        FileInputStream inputStream2 = new FileInputStream(fileName2);
        FileInputStream inputStream3 = new FileInputStream(fileName3);

        while (inputStream2.available() > 0){
            int i = inputStream2.read();
            outputStream1.write(i);
        }
        inputStream2.close();

        while(inputStream3.available() > 0){
            int i = inputStream3.read();
            outputStream1.write(i);
        }
        inputStream3.close();
        outputStream1.close();
    }
}
