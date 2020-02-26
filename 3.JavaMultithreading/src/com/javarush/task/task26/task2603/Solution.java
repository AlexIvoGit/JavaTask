package com.javarush.task.task26.task2603;

import java.util.Comparator;

/*
Убежденному убеждать других не трудно
*/
public class Solution {
    public static class CustomizedComparator<T> implements Comparator<T> {
        private Comparator<T>[] comparators;

        public CustomizedComparator(Comparator... comparators) {
            this.comparators = comparators;
        }

        @Override
        public int compare(T t, T t1) {
            for (Comparator<T> comparator : comparators) {
                int result = comparator.compare(t, t1);
                if ( result != 0) {
                    return result;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}