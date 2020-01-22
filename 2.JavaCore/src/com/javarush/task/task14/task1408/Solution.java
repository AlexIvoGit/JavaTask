package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.UKRAINE);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            if (country.equals(Country.BELARUS)) {
                Hen hen = new BelarusianHen();
                return hen;
            } else if (country.equals(Country.RUSSIA)) {
                Hen hen = new RussianHen();
                return hen;
            } else if (country.equals(Country.MOLDOVA)) {
                Hen hen = new MoldovanHen();
                return hen;
            } else if (country.equals(Country.UKRAINE)) {
                Hen hen = new UkrainianHen();
                return hen;
            } else {
                return null;
            }
        }
    }


}
