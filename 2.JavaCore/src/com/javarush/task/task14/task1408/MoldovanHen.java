package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen implements Country {
    @Override
    public int getCountOfEggsPerMonth() {
        return 19;
    }

    @Override
    public String getDescription() {
        int a = getCountOfEggsPerMonth();
        String country = Country.MOLDOVA;
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + a + " яиц в месяц.";
    }
}
