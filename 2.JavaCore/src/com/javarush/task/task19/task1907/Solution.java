package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName);
        String line = "";

        while (fileReader.ready()) {
            int symbols = fileReader.read();
            line += (char) symbols;
        }
        fileReader.close();

        Pattern pattern = Pattern.compile("\\bworld\\b");
        Matcher matcher = pattern.matcher(line.toLowerCase());
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }

}

