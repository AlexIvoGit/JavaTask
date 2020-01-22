package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Шварцнегер", dateFormat.parse("APRIL 12 2011"));
        map.put("Уилис", dateFormat.parse("JUNE 1 2010"));
        map.put("Викторовна", dateFormat.parse("DECEMBER 1 2008"));
        map.put("Шапочник", dateFormat.parse("MAY 1 2015"));
        map.put("Гузеева", dateFormat.parse("JULY 1 2003"));
        map.put("Рабских", dateFormat.parse("MAY 1 2006"));
        map.put("Анатольевна", dateFormat.parse("AUGUST 1 2011"));
        map.put("Радз", dateFormat.parse("MAY 1 2012"));
        map.put("Накат", dateFormat.parse("MAY 1 2014"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            String s = value.toString();
            if (s.contains("Jun") || s.contains("Jul") || s.contains("Aug")) {
                iterator.remove();
            }
        }
        /*for(Map.Entry<String, Date> entry:map.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }*/

    }

    public static void main(String[] args) throws ParseException {
        //removeAllSummerPeople(createMap());

    }
}
