package com.javarush.task.task27.task2712.kitchen;

public enum Dish { Fish(25), Steak(30), Soup(15), Juice(5), Water(3);
    private int duration;

    public int getDuration() {
        return duration;
    }

    Dish(int duration) {
        this.duration = duration;
    }

    public static String allDishesToString()
    {
        StringBuilder builder = new StringBuilder();
        Dish[] dishes = Dish.values();
        builder.append(dishes[0]);
        for(Dish d : dishes)
        {
            builder.append(", " + d.name());
        }
        return builder.toString();
    }
}
