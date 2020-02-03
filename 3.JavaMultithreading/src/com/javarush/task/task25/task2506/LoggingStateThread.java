package com.javarush.task.task25.task2506;

import java.util.Arrays;

public class LoggingStateThread extends Thread {
    Thread target;

    public LoggingStateThread(Thread target) {
        this.target = target;
        System.out.println(target.getState());
        target.setDaemon(true);
    }

    @Override
    public void run() {
        String log = "NEW";
        while (target.getState() != State.TERMINATED) {
            if (!log.equals(target.getState().name())) {
                log = target.getState().toString();
                System.out.println(log);
            }
        }
    }
}
