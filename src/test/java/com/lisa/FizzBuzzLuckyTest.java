package com.lisa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FizzBuzzLuckyTest {

    @Test
    void goHappyPath() {
        //given

        //when
        final String results = FizzBuzzLucky.fizzBuzz(20);
        final String results2 = FizzBuzzLucky.fizzBuzz(8);

        //then
        assertEquals("1 2 lucky 4 5 fizz 7 8 fizz 10 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 20", results);
        assertEquals("1 2 lucky 4 5 fizz 7 8", results2);
    }
}
