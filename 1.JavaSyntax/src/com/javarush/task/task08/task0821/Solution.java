package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванова", "Ольга");
        map.put("Петрова", "Валентина");
        map.put("Туркова", "Ольга");
        map.put("Иванова", "Татьяна");
        map.put("Гуляр", "Татьяна");
        map.put("Радз", "Ольга");
        map.put("Чердок", "Генадий");
        map.put("Голубь", "Виктор");
        map.put("Фамилия", "Имя");
        map.put("Какой", "Тович");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
