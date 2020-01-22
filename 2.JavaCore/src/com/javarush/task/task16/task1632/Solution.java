package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new ThreadOne());
        threads.add(new ThreadTwo());
        threads.add(new ThreadThree());
        threads.add(new ThreadFour());
        threads.add(new ThreadFive());
    }

    public static void main(String[] args) {
    }

    public static class ThreadOne extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class ThreadTwo extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThreadThree extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    public static class ThreadFour extends Thread implements Message {
        boolean isRun = true;
        @Override
        public void run() {
            while (isRun){}
        }

        @Override
        public void showWarning() {
            this.isRun = false;
            }

        }


    public static class ThreadFive extends Thread {
        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int sum = 0;
                while (true) {
                    String s = reader.readLine();
                    if (s.equals("N")) {
                        break;
                    } else {
                        int i = Integer.parseInt(s);
                        sum = sum + i;
                    }
                    System.out.println(sum);
                }
            } catch (IOException e) {
            }
        }
    }

}