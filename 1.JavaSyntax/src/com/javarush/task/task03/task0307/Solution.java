package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();

        Protoss pr1 = new Protoss();
        Protoss pr2 = new Protoss();
        Protoss pr3 = new Protoss();

        Terran ter1 = new Terran();
        Terran ter2 = new Terran();
        Terran ter3 = new Terran();
        Terran ter4 = new Terran();

        zerg1.name = "z1";
        zerg2.name = "z2";
        zerg3.name = "z3";
        zerg4.name = "z4";
        zerg5.name = "z5";

        pr1.name = "p1";
        pr2.name = "p2";
        pr3.name = "p3";

        ter1.name = "t1";
        ter2.name = "t2";
        ter3.name = "t3";
        ter4.name = "t4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
