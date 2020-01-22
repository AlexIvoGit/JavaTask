package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //Имя,
    //- Имя, вес, возраст
    //- Имя, возраст (вес стандартный)
    //- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
    //- вес, цвет, адрес (чужой домашний кот)
    private String name;
    private int age;
    private int weight;
    private String color;
    private String address;

    public void initialize(String name) {
        this.name = name;
        this.age = 5;
        this.weight = 20;
        this.color = "Black";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Black";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 20;
        this.color = "Black";
    }

    public void initialize(int weight, String color) {
        this.age = 5;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.age = 5;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
