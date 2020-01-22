package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("Name1", new Cat("name1"));
        map.put("Name2", new Cat("name2"));
        map.put("Name3", new Cat("name3"));
        map.put("Name4", new Cat("name4"));
        map.put("Name5", new Cat("name5"));
        map.put("Name6", new Cat("name6"));
        map.put("Name7", new Cat("name7"));
        map.put("Name8", new Cat("name8"));
        map.put("Name9", new Cat("name9"));
        map.put("Name10", new Cat("name10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set set = new HashSet();
        for (Map.Entry entry : map.entrySet()) {
            set.add(entry.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
