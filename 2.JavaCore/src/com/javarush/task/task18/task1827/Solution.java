package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        if (args.length > 0) {
            String productName = args[1];
            String price = args[2];
            String available = args[3];
            int id = 0;
            while (productName.length() < 30) {
                productName += " ";
            }
            while (price.length() < 8) {
                price += " ";
            }
            while (available.length() < 4) {
                available += " ";
            }

            Scanner scanner = new Scanner(new FileInputStream(fileName));
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String ss = s.substring(0, 8).trim();
                int id2 = Integer.parseInt(ss);
                if (id < id2) {
                    id = id2;
                }
            }
            FileOutputStream outputStream = new FileOutputStream(fileName, true);
            int id3 = id + 1;
            String result = "\n" + id3 + productName + price + available;
            outputStream.write(result.getBytes());

            scanner.close();
            outputStream.close();
        }
    }
}
