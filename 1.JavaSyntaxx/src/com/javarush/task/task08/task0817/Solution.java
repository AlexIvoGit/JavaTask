package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> names = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            names.add(entry.getValue());
        }
        for (int i = 0; i < names.size(); i++) {
            String s = names.get(i);
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(j).equals(names.get(i))) {
                    removeItemFromMapByValue(map, s);
                }
            }
        }
        /*for(Map.Entry<String, String> show:map.entrySet()){
            System.out.println(show);
        }*/
        /*for(String ss:names){
            System.out.println(ss);
        }*/
    }


    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
