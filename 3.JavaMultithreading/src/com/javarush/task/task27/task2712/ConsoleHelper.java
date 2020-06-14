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
        List<Dish> dishes = new ArrayList<>();
        System.out.println(Dish.allDishesToString());
        System.out.println("Введите название блюда, введенное 'exit' означает завершение заказа.");
        boolean orderReady = false;
        while (!orderReady) {
            String s = readString();
            switch (s) {
                case "Fish":
                    dishes.add(Dish.Fish);
                    break;
                case "Juice":
                    dishes.add(Dish.Juice);
                    break;
                case "Soup":
                    dishes.add(Dish.Soup);
                    break;
                case "Steak":
                    dishes.add(Dish.Steak);
                    break;
                case "Water":
                    dishes.add(Dish.Water);
                    break;
                case "exit":
                    orderReady = true;
                    break;
            }
        }
        return dishes;
    }



    /*
- List<Dish> getAllDishesForOrder() - просит пользователя выбрать блюдо и добавляет его в список.
    Выведи список всех блюд и попроси пользователя ввести строку - название блюда.
    Введенное 'exit' означает завершение заказа.
    В случае, если введенное блюдо не представлено в меню, выведи сообщение о том, что такого блюда нет и продолжи формирование заказа.
    Исключения ввода-вывода бросай выше, на этом уровне не понятно, что с ними делать.*/
}
