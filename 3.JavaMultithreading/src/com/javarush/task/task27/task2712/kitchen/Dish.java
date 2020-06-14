package com.javarush.task.task27.task2712.kitchen;

public enum Dish {
    Fish, Steak, Soup, Juice, Water;

    public static String allDishesToString() {
        Dish[] values = Dish.values();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            stringBuilder.append(values[i]);
            if (i != values.length - 1) {
                stringBuilder.append(", ");
            } else if (i == values.length - 1) {
                stringBuilder.append(".");
            }
        }
        return stringBuilder.toString();
    }
}
