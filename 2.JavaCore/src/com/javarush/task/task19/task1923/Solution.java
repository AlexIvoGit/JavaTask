package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        String line = "";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            while (fileReader.ready()) {
                line += fileReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]))) {
            String[] strings = line.split("[ ,.?!]");
            String result = "";
            Pattern pattern = Pattern.compile(".*\\d+.*");
            for (int i = 0; i < strings.length; i++) {
                Matcher matcher = pattern.matcher(strings[i]);
                if (matcher.find()) {
                    result += strings[i] + " ";
                }
            }
            bufferedWriter.write(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
