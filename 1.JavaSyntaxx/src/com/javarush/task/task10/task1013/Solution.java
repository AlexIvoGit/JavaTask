package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private double height;
        private double weight;
        private boolean onGlasses;

        public Human(String name, int age, boolean sex, double height, double weight, boolean onGlasses) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
            this.onGlasses = onGlasses;
        }

        public Human(String name, int age, boolean sex, double height, double weight) {
            this(name, age, sex, height, weight, false);
        }

        public Human(String name, int age, boolean sex, double height) {
            this(name, age, sex, height, 0, false);
        }

        public Human(String name, int age, boolean sex){
            this(name, age, sex, 0, 0, false);
        }

        public Human(String name, int age){
            this(name, age, false, 0, 0, false);
        }

        public Human(String name){
            this(name, 0, false, 0, 0, false);
        }

        public Human (){}

        public Human (String name, boolean sex){
            this.name = name;
            this.sex = sex;
        }

        public Human (String name, double height, double weight){
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        public Human (double height, double weight){
            this.weight = weight;
            this.height = height;
        }
    }
}
