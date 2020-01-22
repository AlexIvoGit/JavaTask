package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen implements Country{
    @Override
    public int getCountOfEggsPerMonth() {
        return 15;
    }

    @Override
    public String getDescription() {
        int a = getCountOfEggsPerMonth();
        String country = Country.UKRAINE;
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + a + " яиц в месяц.";
    }
}
