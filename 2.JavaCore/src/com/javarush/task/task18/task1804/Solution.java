package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.util.Collections.frequency;

/*
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file);
        while (inputStream.available() > 0) {
            list.add(inputStream.read());
        }
        inputStream.close();

        int count = frequency(list, list.get(0));
        for (int i = 0; i < list.size(); i++) {
            if (frequency(list, list.get(i)) < count) {
                count = frequency(list, list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {

            if (frequency(list, list.get(i)) == count) {
                if (!list2.contains(list.get(i))) {
                    System.out.print(list.get(i) + " ");
                    list2.add(list.get(i));
                }
            }
        }
        reader.close();

    }
}
