package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Alex", 56, "Irk");
        Man man2 = new Man("Victor", 33, "Moscow");

        Woman woman1 = new Woman("Zina", 76, "LA");
        Woman woman2 = new Woman("JJ", 22, "LA");

        man1.showInfo();
        man2.showInfo();
        woman1.showInfo();
        woman2.showInfo();

    }

    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void showInfo (){
            System.out.println(name + " " + age + " " + address);
        }
    }
    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void showInfo (){
            System.out.println(name + " " + age + " " + address);
        }
    }
}
