package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("мама");
        strings.add("именно");
        strings.add("мыла");
        strings.add("именно");
        strings.add("раму");
        strings.add("именно");
        for(String s:strings){
            System.out.println(s);
        }
    }
}
