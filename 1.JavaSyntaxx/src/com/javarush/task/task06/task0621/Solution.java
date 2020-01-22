package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat catGrandPa = new Cat(grandpaName);

        String grandmotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandPa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandPa);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
            this.mother = null;
        }

        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
            this.father = null;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father == null) {
                return "The cat's name is " + name + ", no mother, no father ";
            } else if (mother == null) {
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            } else if (father == null) {
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            } else  {
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            }
        }
    }
}




