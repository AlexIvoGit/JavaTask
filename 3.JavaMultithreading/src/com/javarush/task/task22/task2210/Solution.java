package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getTokens("level22.lesson13.task01", ".")));
    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        ArrayList<String> list = new ArrayList<>();
        while(tokenizer.hasMoreTokens()){
            list.add(tokenizer.nextToken());
        }
        String[] strings = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            strings[i] = list.get(i);
        }
        return strings;
    }
}
