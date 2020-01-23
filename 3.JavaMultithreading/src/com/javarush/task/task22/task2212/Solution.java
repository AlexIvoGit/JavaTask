package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber != null && telNumber.length() != 0) {
            return telNumber.matches("(?:\\+\\d{2})?\\(?\\d{3}\\)?\\d{3}-?\\d{2}-?\\d{2}");
        }
        return false;
    }

    public static void main(String[] args) {
        String one = "+380501234567";
        String two = "+38(050)1234567";
        String three = "+38050123-45-67";
        String four = "050123-4567";
        String five = "+38)050(1234567";
        String six = "+38(050)1-23-45-6-7";
        String seven = "050ххх4567";
        String eight = "050123456";
        String nine = "(0)501234567";

        System.out.println(one + checkTelNumber(one));
        System.out.println(two + checkTelNumber(two));
        System.out.println(three + checkTelNumber(three));
        System.out.println(four + checkTelNumber(four));
        System.out.println(five + checkTelNumber(five));
        System.out.println(six + checkTelNumber(six));
        System.out.println(seven + checkTelNumber(seven));
        System.out.println(eight + checkTelNumber(eight));
        System.out.println(nine + checkTelNumber(nine));

    }
}
