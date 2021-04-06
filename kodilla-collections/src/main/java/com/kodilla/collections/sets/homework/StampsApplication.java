package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamps> stamps = new HashSet<>();
        stamps.add(new Stamps("stampWithAnimals", 44.5, 32.5, false));
        stamps.add(new Stamps("stampWithCities", 39.5, 31.25, true));
        stamps.add(new Stamps("stampWithMonuments", 43.5, 32.0, true));
        stamps.add(new Stamps("stampWithFlowers", 41.5, 30.5, true));
        stamps.add(new Stamps("stampsWithKings", 45.5, 34.5, false));
        stamps.add(new Stamps("stampsWithAnimals", 45.5, 34.5, false));

        System.out.println(stamps.size());
        for(Stamps stamp : stamps) {
            String stampStatus;
            if (stamp.isStamped()) {
                stampStatus = "STAMPED";
            } else {
                stampStatus = "NOT STAMPED";
            }
            System.out.println(stamp.getStampName() + ": " + stamp.getStampSize() + " " + stampStatus);
        }
    }
}
