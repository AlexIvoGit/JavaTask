package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("А");
        words.add("Б");
        words.add("В");
    }

    public static void main(String[] args) {
        String fileName = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while(fileReader.ready()){
                int count = 0;
                String line = fileReader.readLine().replaceAll(",", "");
                String[] strings = line.split(" ");

                for(int i = 0; i < strings.length; i++){
                    if(words.contains(strings[i].trim())){
                        count++;
                    }
                }
                if(count == 2){
                    System.out.println(line);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
