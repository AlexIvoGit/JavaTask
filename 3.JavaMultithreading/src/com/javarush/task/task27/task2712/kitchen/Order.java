package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private final Tablet tablet;
    protected List<Dish> dishes = new ArrayList<>();


    public List<Dish> getDishes() {
        return dishes;
    }

    public int getTotalCookingTime() {
        int duration = 0;
        for (Dish d : dishes)
            duration += d.getDuration();
        return duration;
    }

    public String getTabletName(){
        return this.tablet.toString();
    }

    protected void initDishes() throws IOException {
        dishes = ConsoleHelper.getAllDishesForOrder();
    }

    public Tablet getTablet() {
        return tablet;
    }

    @Override
    public String toString() {
        if (dishes.size() == 0)
            return "";
        StringBuilder builder = new StringBuilder();
        for (Dish d : dishes) {
            builder.append(d.name() + ", ");
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.deleteCharAt(builder.length() - 1);
        //Your order: [Juice, Fish] of Tablet{number=5}
        String res = String.format("Your order: [%s] of %s", builder.toString(), tablet.toString());
        return res;
    }

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        initDishes();
    }

    public boolean isEmpty() {
        if (dishes.size() == 0)
            return true;
        return false;
    }
}
