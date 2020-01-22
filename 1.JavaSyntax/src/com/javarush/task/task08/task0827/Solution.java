package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2000"));
    }

    public static boolean isDateOdd(String date) {
        Date thisDate = new Date(date);
        Date yearBegin = new Date(date);
        yearBegin.setMonth(0);
        yearBegin.setDate(1);
        long mSec = thisDate.getTime() - yearBegin.getTime();
        long min = mSec / 60000;
        long days = min / 1440;

        if (days % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
