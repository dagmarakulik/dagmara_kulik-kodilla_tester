package com.kodilla.mockito.homework;


import com.kodilla.mockito.notification.Notification;
import com.kodilla.mockito.notification.homework.Location;
import com.kodilla.mockito.notification.homework.User;
import com.kodilla.mockito.notification.homework.WeatherMonitoringSystem;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class WeatherMonitoringSystemTestSuite {

    WeatherMonitoringSystem weatherMonitoringSystem = new WeatherMonitoringSystem();
    User user = Mockito.mock(User.class);
    User user1 = Mockito.mock(User.class);
    Notification notification = Mockito.mock(Notification.class);
    Location location = Mockito.mock(Location.class);
    Location location1 = Mockito.mock(Location.class);

    @Test
    public void notSubscribedUserShouldNotReceiveNotificationWeather() {
        weatherMonitoringSystem.sendNotification(notification);
        Mockito.verify(user, Mockito.never()).receive(notification);
    }
    @Test
    public void subscribedUserShouldReceiveNotification() {
        weatherMonitoringSystem.addUserToLocation(user,location);
        weatherMonitoringSystem.sendNotification(notification);
        Mockito.verify(user, Mockito.times(1)).receive(notification);
    }
    @Test
    public void allSubscribedUsersShouldReceiveNotification() {
        weatherMonitoringSystem.addUserToLocation(user, location);
        weatherMonitoringSystem.addUserToLocation(user1, location1);
        weatherMonitoringSystem.sendNotification(notification);
        Mockito.verify(user, Mockito.times(1)).receive(notification);
        Mockito.verify(user1, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedUserShouldNotReceiveNotificationAndAlarm() {
        weatherMonitoringSystem.addUserToLocation(user, location);
        weatherMonitoringSystem.removeUserSubscription(user);
        weatherMonitoringSystem.sendNotification(notification);
        weatherMonitoringSystem.sendWeatherAlarm(location);
        Mockito.verify(user, Mockito.never()).receive(notification);
        Mockito.verify(user, Mockito.never()).receive(location);
    }

    @Test
    public void everyUserSubscribedLocationShouldReceiveAlarm() {
        weatherMonitoringSystem.addUserToLocation(user, location);
        weatherMonitoringSystem.addUserToLocation(user1, location1);
        weatherMonitoringSystem.sendWeatherAlarm(location);
        Mockito.verify(user, Mockito.times(1)).receive(location);
        Mockito.verify(user1, Mockito.times(1)).receive(location);
    }

    @Test
    public void locationShouldBeRemoved() {
        weatherMonitoringSystem.removeLocation(location);
        Mockito.verify(location, Mockito.times(1)).deleteLocation();
    }

}