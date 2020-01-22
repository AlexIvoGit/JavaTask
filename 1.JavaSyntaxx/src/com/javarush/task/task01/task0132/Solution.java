package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
            }


    public static int sumDigitsInNumber(int number) {
        String num = Integer.toString(number);
        String n1 = num.substring(0,1);
        String n2 = num.substring(1,2);
        String n3 = num.substring(2);
        int n11 = Integer.parseInt(n1);
        int n22 = Integer.parseInt(n2);
        int n33 = Integer.parseInt(n3);
        return n11 + n22 + n33;

    }
}