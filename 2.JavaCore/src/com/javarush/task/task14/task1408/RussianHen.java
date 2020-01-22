package com.javarush.task.task14.task1408;

public class RussianHen extends Hen implements Country {
    @Override
    public int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    public String getDescription() {
        int a = getCountOfEggsPerMonth();
        String country = Country.RUSSIA;
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + a + " яиц в месяц.";
    }
}
