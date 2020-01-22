package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try {
            for (int i = 0; true; i++) {
                list.add(Integer.parseInt(reader.readLine()));
            }
        } catch (NumberFormatException | IOException e) {
            for(Integer nums : list){
                System.out.println(nums);
            }
        }
    }
}
