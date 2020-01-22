package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> employee = new HashMap<>();
        employee.put("Иванов", 350);
        employee.put("Петров", 650);
        employee.put("Лобачев", 420);
        employee.put("Сидоров", 865);
        employee.put("Иванова", 550);
        employee.put("Антохина", 470);
        employee.put("Петрова", 1000);
        employee.put("Калмыкина", 590);
        employee.put("Радз", 150);
        employee.put("Куол", 200);
        return employee;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            int value = pair.getValue();
            if (value < 500) {
                iterator.remove();
            }

        }
    }

    public static void main(String[] args) {


    }
}