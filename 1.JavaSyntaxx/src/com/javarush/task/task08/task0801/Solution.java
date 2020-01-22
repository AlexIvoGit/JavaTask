package com.javarush.task.task08.task0801;

/* 
Set из растений
арбуз
банан
вишня
груша
дыня
ежевика
женьшень
земляника
ирис
картофель

*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> fruit = new HashSet<String>();
        fruit.add("арбуз");
        fruit.add("банан");
        fruit.add("вишня");
        fruit.add("груша");
        fruit.add("дыня");
        fruit.add("ежевика");
        fruit.add("женьшень");
        fruit.add("земляника");
        fruit.add("ирис");
        fruit.add("картофель");

        for (String ss:fruit){
            System.out.println(ss);
        }

    }
}
