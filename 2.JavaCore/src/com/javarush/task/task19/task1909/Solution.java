package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        /*String fileName1 = "c:\\Temp\\Task1909\\File1.txt";
        String fileName2 = "c:\\Temp\\Task1909\\File2.txt";*/

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));
        StringBuilder result = new StringBuilder();

        while (fileReader.ready()) {
            int symbols = fileReader.read();
            if (symbols == 46) {
                result.append("!");
            } else {
                result.append((char) symbols);
            }
        }
        fileWriter.write(result.toString());
        fileReader.close();
        fileWriter.close();
    }
}
