package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return reader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> dishesOrdered = new ArrayList<>();
        writeMessage(Dish.allDishesToString());
        writeMessage("Please select the dishes! To finish order please enter 'exit'");
        while (true) {
            String dishSelect = readString();
            if (dishSelect.equals("exit")) {
                return dishesOrdered;
            } else if (Dish.allDishesToString().contains(dishSelect)) {
                dishesOrdered.add(Dish.valueOf(dishSelect));
            } else {
                writeMessage("This dish doesn't exist. Please select the dish from the list!");
            }
        }

    }
}
