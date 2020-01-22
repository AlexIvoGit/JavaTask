package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        FileReader fileReader = new FileReader(fileName1);
        FileWriter fileWriter = new FileWriter(fileName2);
        for (int i = 1; fileReader.ready(); i++) {
            int symbols = fileReader.read();
            if (i % 2 == 0) {
                fileWriter.write(symbols);
            }
        }
        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
