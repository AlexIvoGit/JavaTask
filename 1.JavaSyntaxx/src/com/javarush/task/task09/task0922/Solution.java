package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dateString = reader.readLine();
        String[] arrayData = dateString.split("-");
        int year = Integer.parseInt(arrayData[0]);
        int month = Integer.parseInt(arrayData[1]);
        int day = Integer.parseInt(arrayData[2]);
        Date date = new Date(year - 1900, month - 1, day);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(dateFormat.format(date).toUpperCase());
        //System.out.println("Год:" + year + "Месяц:" + month + "День:" + day);


    }
}
