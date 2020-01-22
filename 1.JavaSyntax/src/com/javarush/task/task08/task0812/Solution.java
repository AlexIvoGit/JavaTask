package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add(Integer.parseInt(reader.readLine()));
        }
        ArrayList<Integer> countList = new ArrayList<>();
        int count = 1;

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i).equals(nums.get(i - 1))) {
                count++;
            } else {
                count = 1;
            }
            countList.add(count);
        }

        Collections.sort(countList);
        System.out.println(countList.get(countList.size() - 1));


    }
}