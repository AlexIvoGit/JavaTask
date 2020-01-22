package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public interface CanFly{
        public static void fly(){};
    }

    public interface CanClimb{
        public static void climb(){};
    }

    public interface CanRun{
        public static void run(){};
    }

    public static void main(String[] args) {

    }

    public class Cat implements CanRun, CanClimb {
    }

    public class Dog implements CanRun {
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun, CanFly {
    }
}
