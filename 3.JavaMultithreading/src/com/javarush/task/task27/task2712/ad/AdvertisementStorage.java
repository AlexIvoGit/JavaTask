package com.javarush.task.task27.task2712.ad;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementStorage {
    private static AdvertisementStorage instance = new AdvertisementStorage();
    private AdvertisementStorage(){
        Object someContent = new Object();
        videos.add(new Advertisement(someContent, "First Video", 5000, 100, 3 * 60)); // 3 min
        videos.add(new Advertisement(someContent, "Second Video", 100, 10, 15 * 60)); //15 min
        videos.add(new Advertisement(someContent, "Third Video", 400, 2, 10 * 60)); //10 min
        videos.add(new Advertisement(someContent, "четвертое видео", 400, 2, 10 * 60)); //10 min

 /*       //////////////////////////////
        videos.add(new Advertisement(someContent, "v4", 500, 2, 1 * 60)); //10 min
        videos.add(new Advertisement(someContent, "v5", 200, 2, 2 * 60)); //10 min
        videos.add(new Advertisement(someContent, "v6", 150, 2, 7 * 60)); //10 min*/
    }
    public static AdvertisementStorage getInstance(){return instance;}

    private final List<Advertisement> videos = new ArrayList<>();

    public List<Advertisement> list()
    {
        return videos;
    }

    public void add(Advertisement advertisement)
    {
        videos.add(advertisement);
    }
}
