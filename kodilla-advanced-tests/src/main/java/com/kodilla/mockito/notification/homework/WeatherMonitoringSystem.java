package com.kodilla.mockito.notification.homework;

import com.kodilla.mockito.notification.Notification;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherMonitoringSystem {

    Set<Location> locations = new HashSet<>();
    private Map<User, Set<Location>> usersList = new HashMap<>();

    public void addUserToLocation(User user, Location location) {
        if (usersList.containsKey(user)) {
            usersList.get(user).add(location);
        } else {
            this.locations.add(location);
            usersList.put(user, locations);
        }
    }

    public void sendNotification(Notification notification) {
        this.usersList.forEach((user, locations) -> user.receive(notification));
    }

    public void sendWeatherAlarm (Location location) {
        this.usersList.entrySet().stream().filter(user -> user.getValue().contains(location)).forEach(user -> user.getKey().receive(location));
    }

    public void removeUserSubscription(User user) {
        this.usersList.remove(user);

    }

    public void removeLocationSubscription(User user, Location location) {
        for (Map.Entry<User, Set<Location>> usersSubscriptions : usersList.entrySet()) {
            if (usersSubscriptions.getKey().equals(user)) {
                usersSubscriptions.getValue().remove(location);
                if (usersSubscriptions.getValue().isEmpty()) {
                    this.usersList.remove(user);
                }
            }
        }
    }

    public void removeApplicationSubscription (User user) {
        this.usersList.remove(user);
    }

    public void removeLocation(Location location) {
        location.deleteLocation();
    }
}
