package com.kodilla.mockito.notification.homework;

import com.kodilla.mockito.notification.Notification;

public interface User {

    void receive(Notification notification);
    void receive(Location locationAlarm);
}
