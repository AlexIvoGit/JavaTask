package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        /*String fileName1 = "c:\\Temp\\Task1910\\File1.txt";
        String fileName2 = "c:\\Temp\\Task1910\\File2.txt";*/

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));
        StringBuilder line = new StringBuilder();
        while (fileReader.ready()) {
            int i = fileReader.read();
            line.append((char) i);
        }
        fileReader.close();
        Pattern pattern = Pattern.compile("[^\\w\\s\\n]");
        Matcher matcher = pattern.matcher(line);
        String s = matcher.replaceAll("");
        fileWriter.write(s);
        fileWriter.close();
    }
}
