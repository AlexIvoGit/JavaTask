package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen implements Country {
    @Override
    public int getCountOfEggsPerMonth() {
        return 25;
    }
    @Override
    public String getDescription() {
        int a = getCountOfEggsPerMonth();
        String country = Country.BELARUS;
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + a + " яиц в месяц.";
    }
}
