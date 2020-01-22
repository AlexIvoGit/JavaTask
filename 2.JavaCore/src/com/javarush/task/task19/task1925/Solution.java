package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String fileName1 = args[0];
        String fileName2 = args[1];
        String line = "";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1))) {
            while (fileReader.ready()) {
                line += fileReader.readLine() + " ";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] words = line.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 6) {
                result += words[i] + ",";
            }
        }

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2))) {
            fileWriter.write(result.substring(0, result.length() - 1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
