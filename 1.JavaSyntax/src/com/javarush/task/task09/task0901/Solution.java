package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack;
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack;
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack;
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack;
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack;
    }
}
