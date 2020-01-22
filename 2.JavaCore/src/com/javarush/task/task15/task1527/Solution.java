package com.javarush.task.task15.task1527;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        URL url = new URL(reader.readLine());
        String[] url2 = url.getQuery().split("&");
        for (String s : url2) {
            if (s.contains("=")) {
                System.out.print(s.substring(0, s.indexOf("=")) + " ");
            } else {
                System.out.print(s + " ");
            }
        }
        for (String s : url2) {
            try {
                if (s.contains("obj")) {
                    System.out.println();
                    alert(Double.parseDouble(s.substring(s.indexOf("=") + 1)));
                }
            } catch (Exception e) {
                alert(s.substring(s.indexOf("=") + 1));
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
