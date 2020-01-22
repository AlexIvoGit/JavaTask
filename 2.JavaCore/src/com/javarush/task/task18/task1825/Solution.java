package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer, String> list = new TreeMap<>();
        while (true) {
            String s = reader.readLine();
            if (s.equals("end")) {
                break;
            } else {
                int i = s.indexOf("part") + 4;
                int a = Integer.parseInt(s.substring(i));
                list.put(a, s);
            }
        }
        String fileNameOutput = list.get(1).substring(0, list.get(1).indexOf("part") - 1);
        FileOutputStream outputStream = new FileOutputStream(fileNameOutput, true);
        for(Map.Entry map : list.entrySet()){
            String fileName = map.getValue().toString();
            FileInputStream inputStream = new FileInputStream(fileName);
            byte[] bytes = new byte[inputStream.available()];
            while(inputStream.available() > 0){
                inputStream.read(bytes);
                outputStream.write(bytes);
            }
            inputStream.close();
        }
        outputStream.close();
    }
}
