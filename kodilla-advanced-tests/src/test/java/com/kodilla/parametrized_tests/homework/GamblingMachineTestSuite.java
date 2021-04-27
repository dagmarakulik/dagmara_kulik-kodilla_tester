package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumberOfUser.csv", numLinesToSkip = 0)
    public void shouldReturnTrueIfNumberOfUserIsCorrect(String numbers) throws InvalidNumbersException {
        //given
        Set<Integer> list = new HashSet<>();
        String[] numArray = numbers.split(",");
        for(String number : numArray){
            int num = Integer.parseInt(number);
            list.add(num);
        }
        //when
        gamblingMachine.howManyWins(list);
        //then
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/tooSmallSet.csv", numLinesToSkip = 0)
    public void shouldReturnFalseIfSetIsToSmall(String numbers) throws InvalidNumbersException {
        //given
        Set<Integer> list = new HashSet<>();
        String[] numArray = numbers.split(",");
        for(String number : numArray){
            int num = Integer.parseInt(number);
            list.add(num);
        }
        //then
        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(list);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/tooBigSet.csv", numLinesToSkip = 0)
    public void shouldReturnFalseIfSetIsToBig(String numbers) throws InvalidNumbersException {
        //given
        Set<Integer> list = new HashSet<>();
        String[] numArray = numbers.split(",");
        for(String number : numArray){
            int num = Integer.parseInt(number);
            list.add(num);
        }
        //then
        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(list);
        });
        System.out.println(list);
    }
}