package com.javarush.task.task02.task0216;

/* 
Минимум трёх чисел
*/
public class Solution {
    public static int min(int a, int b, int c) {
        int min2 = 0;
        if (a <= b && a <= c) {
            min2 = a;
        } else if (b <= a && b <= c) {
            min2 = b;
        } else if (c <= a && c <= b) {
            min2 = c;
        }
        return min2;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}