package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        String tag = args[0];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String body = "";
        while(fileReader.ready()){
            String line = fileReader.readLine().trim();
            body += line;
        }
        fileReader.close();

        Pattern pattern = Pattern.compile("(<" + tag + ")|(" + "</" + tag + ")");
        Matcher matcher = pattern.matcher(body);
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        while(matcher.find()){
            if (matcher.group(1) != null){
                stack.push(matcher.start());
                map.put(matcher.start(), -1);
            } else {
                map.put(stack.pop(), matcher.start());
            }
        }

        TreeMap treeMap = new TreeMap(map);

        String result = body;
        treeMap.forEach((key, value) -> {
            System.out.println(result.substring((int)key, (int)value + tag.length() + 3));
        });


    }
}
