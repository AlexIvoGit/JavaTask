package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        double percent = i * 10.0 / 100;
        return i + percent;

    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
