package com.javarush.task.task19.task1908;

/* 
Выделяем числа
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

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));

        String line = "";
        while (fileReader.ready()) {
            int symbols = fileReader.read();
            line += (char) symbols;
        }
        fileReader.close();
        String[] strings = line.split("\\s");
        Pattern pattern = Pattern.compile("\\D");
        for (String ss : strings) {
            Matcher matcher = pattern.matcher(ss);
            if(!matcher.find()){
                fileWriter.write(ss + " ");
            }
        }

        fileWriter.close();
    }
}
