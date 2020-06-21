package com.javarush.task.task27.task2712;

import java.util.ArrayList;
import java.util.List;

public class RandomOrderGeneratorTask implements Runnable {
    private List<Tablet> tablets;
    private int interval;

    public RandomOrderGeneratorTask(List<Tablet> tablets, int interval) {
        this.tablets = tablets;
        this.interval = interval;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(interval);
                int i = (int) (Math.random() * (tablets.size()));
                tablets.get(i).createTestOrder();

            } catch (InterruptedException e) {
                ConsoleHelper.writeMessage("RandomOrderGeneratorTask: " + e);
                break;
            }

        }

    }
}

