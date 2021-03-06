package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                String s1 = list.get(i).toLowerCase();
                String s2 = list.get(j).toLowerCase();
                if (s1.equals(s2)) {
                    count++;
                }
            }
            result.put(list.get(i).toLowerCase(), count);
        }


        return result;
    }

}

