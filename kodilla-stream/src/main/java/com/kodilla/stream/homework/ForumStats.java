package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgOver40 = UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("średnia liczba postów dla użytkowników, których wiek jest >= 40: " + avgOver40);

        double avgBelow40 = UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Średnia liczba postów dla użytkowników, których wiek jest < 40: " + avgBelow40);



    }
}
