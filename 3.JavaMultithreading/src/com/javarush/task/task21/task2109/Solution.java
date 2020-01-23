package com.javarush.task.task21.task2109;

import java.util.Objects;

/*
Запретить клонирование
*/
public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }

    public static class B extends A {
        private String name;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            if (this.getClass() == B.class) {
                throw new CloneNotSupportedException();
            }
            return super.clone();
        }

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (this.getClass() == o.getClass()) {
                return true;
            }
            B b = (B) o;
            return Objects.equals(name, b.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        public String getName() {
            return name;
        }
    }

    public static class C extends B {
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public C(int i, int j, String name) {
            super(i, j, name);
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        C one = new C(5, 6, "sd");
        C two = null;
        two = (C) one.clone();
        /*B ones = new B(4, 5, "ds");
        B twos = null;
        twos = (B) ones.clone();*/
    }
}
