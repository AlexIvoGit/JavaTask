package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            String s = "Какая то строка " + i;
            list.add(s);
        }
        System.out.println(list.size());
        for(String list2:list){
            System.out.println(list2);
        }
    }
}
