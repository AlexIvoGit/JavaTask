package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = reader.readLine();
            FileInputStream file = new FileInputStream(fileName);
            Scanner scanner = new Scanner(file);
            ArrayList<Integer> arrayList = new ArrayList<>();
            while (scanner.hasNext()) {
                int i = Integer.parseInt(scanner.next());
                if (i % 2 == 0) {
                    arrayList.add(i);
                }
            }
            file.close();
            Collections.sort(arrayList);
            for (int nums : arrayList) {
                System.out.println(nums);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файла не существует");
        } catch (IOException e1) {
            System.out.println("Не верные данные");
        }
    }
}
