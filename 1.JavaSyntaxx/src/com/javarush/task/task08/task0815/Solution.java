package com.javarush.task.task08.task0815;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванова", "Ольга");
        map.put("Петрова", "Валентина");
        map.put("Туркова", "Ольга");
        map.put("Самох", "Виктор");
        map.put("Гуляр", "Татьяна");
        map.put("Радз", "Ольга");
        map.put("Чердок", "Генадий");
        map.put("Голубь", "Виктор");
        map.put("Фамилия", "Имя");
        map.put("Какой", "Тович");
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        ArrayList<String> names = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            names.add(entry.getValue());
        }
        int count = names.size();

        for (int i = 0; i < names.size(); i++) {
            if (names.contains(name)) {
                names.remove(name);
            }
        }

        int count2 = names.size();
        return count - count2;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        ArrayList<String> names = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            names.add(entry.getKey());
        }
        int count = names.size();

        for (int i = 0; i < names.size(); i++) {
            if (names.contains(lastName)) {
                names.remove(lastName);
            }
        }

        int count2 = names.size();
        return count - count2;

    }

    public static void main(String[] args) {
    }
}
