package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        int i = Integer.parseInt(args[0]);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        Scanner scanner = new Scanner(inputStream);
        while(scanner.hasNextLine()){
            String s = scanner.nextLine();
            String[] strings = s.split(" ");
            int a = Integer.parseInt(strings[0]);
            if(a == i){
                System.out.println(s);
                break;
            }
        }
        reader.close();
        inputStream.close();
    }
}
