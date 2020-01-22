package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int a1 = a - 10;
        int b1 = b - 10;

        int a2 = abs(a1);
        int b2 = abs(b1);

        if (a2 > b2) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}