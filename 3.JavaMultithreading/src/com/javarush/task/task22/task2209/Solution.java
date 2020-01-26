package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) {
        //...
        StringBuilder s = new StringBuilder();
        String fileName = "";
        try (BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = readerConsole.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                s.append(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder result = getLine(s.toString());
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        /*String s = words[0];
        String[] strings = s.split(" ");
        Arrays.sort(strings);
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add(strings[0]);
        StringBuilder stringBuilder = new StringBuilder();
        String endWord = stringArrayList.get(stringArrayList.size() - 1).substring(stringArrayList.get(stringArrayList.size() - 1).length() - 1).toLowerCase();
        int count = 0;
        while (count != 3) {
            for (int i = 1; i < strings.length; i++) {
                strings[0] = "/";
                String startWord = strings[i].substring(0, 1).toLowerCase();
                if (startWord.equals(endWord)) {
                    endWord = strings[i].substring(strings[i].length() - 1).toLowerCase();
                    stringArrayList.add(strings[i]);
                    strings[i] = "/";
                }
            }
            count++;
        }
        for (String s1 : stringArrayList) {
            stringBuilder.append(s1 + " ");
        }
        return stringBuilder;*/
        return new StringBuilder();
    }
}
