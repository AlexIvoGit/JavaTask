package com.javarush.task.task27.task2712.ad;

import java.util.LinkedList;
import java.util.List;

public class StatisticAdvertisementManager {
    private static StatisticAdvertisementManager statisticAdvertisementManager;
    private AdvertisementStorage advertisementStorage = AdvertisementStorage.getInstance();

    private StatisticAdvertisementManager() {
    }

    public static StatisticAdvertisementManager getInstance() {
        if (statisticAdvertisementManager == null) {
            statisticAdvertisementManager = new StatisticAdvertisementManager();
        }
        return statisticAdvertisementManager;
    }

    public List<Advertisement> getAvailableVideos() {
        List<Advertisement> result = new LinkedList<>();
        List<Advertisement> source = advertisementStorage.list();

        for (Advertisement ad : source) {
            if (ad.getHits() > 0) result.add(ad);
        }

        return result;
    }

    public List<Advertisement> getNotAvailableVideos() {
        List<Advertisement> result = new LinkedList<>();
        List<Advertisement> source = advertisementStorage.list();

        for (Advertisement ad : source) {
            if (ad.getHits() == 0) result.add(ad);
        }

        return result;
    }
}
