package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human();
        Human child2 = new Human();
        Human child3 = new Human();
        Human father = new Human();
        Human mother = new Human();
        Human grandPa = new Human();
        Human grandPa2 = new Human();
        Human grandMa = new Human();
        Human grandMa2 = new Human();

        grandPa.name = "GrandPa1";
        grandPa2.name = "GrandPa2";
        grandMa.name = "GrandMa1";
        grandMa2.name = "GrandMa2";
        father.name = "Father";
        mother.name = "Mother";
        child1.name = "Child1";
        child2.name = "Child2";
        child3.name = "Child3";

        grandPa.sex = true;
        grandPa2.sex = true;
        grandMa.sex = false;
        grandMa2.sex = false;
        father.sex = true;
        mother.sex = false;
        child1.sex = true;
        child2.sex = false;
        child3.sex = false;

        grandPa.age = 51;
        grandPa2.age = 55;
        grandMa.age = 60;
        grandMa2.age = 59;
        father.age = 30;
        mother.age = 25;
        child1.age = 5;
        child2.age = 12;
        child3.age = 15;

        grandPa.children.add(father);
        grandPa2.children.add(mother);
        grandMa.children.add(father);
        grandMa2.children.add(mother);
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);


        System.out.println(grandPa.toString());
        System.out.println(grandPa2.toString());
        System.out.println(grandMa.toString());
        System.out.println(grandMa2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
