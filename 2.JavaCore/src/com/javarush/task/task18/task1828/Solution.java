package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        if (args.length > 0) {
            switch (args[0]) {
                case "-u":
                    String id = args[1];
                    String productName = args[2];
                    String price = args[3];
                    String available = args[4];
                    while (id.length() < 8) {
                        id += " ";
                    }

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
                    ArrayList<String> list = new ArrayList<>();
                    while (scanner.hasNextLine()) {
                        String s1 = scanner.nextLine();
                        String s2 = s1.substring(0, 8);
                        String s3 = s1.substring(8);
                        if (s2.equals(id)) {
                            String total = productName + price + available;
                            list.add(s2 + total);
                        } else {
                            list.add(s2 + s3);
                        }
                    }
                    FileOutputStream outputStream = new FileOutputStream(fileName);
                    String result = "";
                    for (int i = 0; i < list.size(); i++) {
                        result += list.get(i) + "\n";
                    }
                    outputStream.write(result.getBytes());

                    scanner.close();
                    outputStream.close();
                    break;

                case "-d":
                    String idD = args[1];
                    while (idD.length() < 8) {
                        idD += " ";
                    }
                    Scanner scannerD = new Scanner(new FileInputStream(fileName));
                    TreeMap<String, String> list1 = new TreeMap<>();
                    while (scannerD.hasNextLine()) {
                        String s1 = scannerD.nextLine();
                        String s2 = s1.substring(0, 8);
                        String s3 = s1.substring(8);
                        if (s2.equals(idD)) {
                        } else {
                            list1.put(s2, s3);
                        }
                    }

                    FileOutputStream outputStreamD = new FileOutputStream(fileName);
                    String resultD = "";
                    for (Map.Entry map : list1.entrySet()) {
                        resultD += map.getKey() + map.getValue().toString() + "\n";
                    }
                    outputStreamD.write(resultD.getBytes());

                    scannerD.close();
                    outputStreamD.close();
                    break;
            }
        }
    }
}
