package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private static List<Horse> horses = new ArrayList<>();

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static Hippodrome game;

    public void run() throws InterruptedException {
        for (int i = 0; i < 6; i++) {
            move();
            print();
            Thread.sleep(200);
        }

    }

    public void move() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }
    }

    public void print() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        double distance = 0;
        for (int i = 0; i < horses.size(); i++) {
            if (horses.get(i).getDistance() > distance) {
                distance = horses.get(i).getDistance();
            }
        }
        for (int i = 0; i < horses.size(); i++) {
            if (horses.get(i).getDistance() == distance) {
                return horses.get(i);
            }
        }
        return null;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {
        horses.add(new Horse("Horse1", 3, 0));
        horses.add(new Horse("Horse2", 3, 0));
        horses.add(new Horse("Horse3", 3, 0));
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }
}

