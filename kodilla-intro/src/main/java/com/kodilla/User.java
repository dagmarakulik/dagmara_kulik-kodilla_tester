package com.kodilla;

public class User {
    String userName;
    int userAge;

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public static void main(String[] args) {


        User kasia = new User("Kasia", 25);
        User marta = new User("Marta", 20);
        User sylwia = new User("Sylwia", 67);
        User magda = new User("Magda", 45);
        User piotr = new User("Piotr", 54);
        User marek = new User("Marek", 18);
        User mateusz = new User("Mateusz", 36);

        User[] users = {kasia, marta, sylwia, magda, piotr, marek, mateusz};
        usersAverageAge(users);
    }

    public static void usersAverageAge(User[] users) {
        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].userAge;
        }

        int average = sum / users.length;
        for (int i = 0; i < users.length; i++) {
            if (average > users[i].userAge) {
                System.out.println(users[i].userName);
            }
        }
    }
}

