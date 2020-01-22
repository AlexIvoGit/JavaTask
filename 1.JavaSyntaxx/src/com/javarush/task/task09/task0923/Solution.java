package com.javarush.task.task09.task0923;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = s.trim();
        char[] sChar = s1.toCharArray();
        for (int i = 0; i < sChar.length; i++) {
            if (isVowel(sChar[i])) {
                System.out.print(sChar[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < sChar.length; i++) {
            if (isVowel(sChar[i])) {
            } else if (sChar[i] == ' ') {
            } else {
                System.out.print(sChar[i] + " ");
            }
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}