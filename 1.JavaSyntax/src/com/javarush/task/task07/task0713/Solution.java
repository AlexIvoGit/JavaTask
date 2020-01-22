package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> data = new ArrayList<>();
        ArrayList<Integer> onThree = new ArrayList<>();
        ArrayList<Integer> onTwo = new ArrayList<>();
        ArrayList<Integer> mainList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            data.add(x);
        }

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) % 3 == 0) onThree.add(data.get(i));
            if (data.get(i) % 2 == 0) onTwo.add(data.get(i));
            if (data.get(i) % 3 != 0 && data.get(i) % 2 != 0) mainList.add(data.get(i));
        }
        printList(onThree);
        printList(onTwo);
        printList(mainList);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i : list) {
            System.out.println(i);
        }
    }
}
