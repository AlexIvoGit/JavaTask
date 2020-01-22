package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(fileName1);
        FileInputStream inputStream1 = new FileInputStream(fileName2);

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (inputStream1.available() > 0) {
            int i = inputStream1.read();
            arrayList.add(i);
        }
        while (inputStream.available() > 0) {
            int i = inputStream.read();
            arrayList.add(i);
        }

        FileOutputStream outputStream = new FileOutputStream(fileName1);
        for(int i = 0; i < arrayList.size(); i++){
            outputStream.write(arrayList.get(i));
        }

        inputStream.close();
        inputStream1.close();
        outputStream.close();


    }
}
