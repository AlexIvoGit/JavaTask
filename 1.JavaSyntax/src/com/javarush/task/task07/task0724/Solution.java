package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandpa1 = new Human("GrandPa1", true, 65);
        Human grandpa2 = new Human("GrandPa2", true, 70);
        Human grandma1 = new Human("GrandMa1", false, 63);
        Human grandma2 = new Human("GrandMa2", false, 71);
        Human father = new Human("Father", true, 30, grandpa1, grandma1);
        Human mother = new Human("Mother", false, 25, grandpa2, grandma2);
        Human child1 = new Human("Child1", true, 5, father, mother);
        Human child2 = new Human("Child2", false, 9, father, mother);
        Human child3 = new Human("Child3", true, 12, father, mother);

        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human (String name, boolean sex, int age){
            this(name, sex, age, null, null);
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}