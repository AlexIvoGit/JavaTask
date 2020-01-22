package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
            exceptions.add(new ArrayIndexOutOfBoundsException());
            exceptions.add(new NullPointerException());
            exceptions.add(new FileNotFoundException());
            exceptions.add(new IndexOutOfBoundsException());
            exceptions.add(new Exception());
            exceptions.add(new NumberFormatException());
            exceptions.add(new RuntimeException());
            exceptions.add(new IOException());
            exceptions.add(new IllegalAccessException());

        }
    }
}
