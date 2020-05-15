package com.lisa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FizzBuzzLuckyTest {

    @Test
    void goHappyPath() {
        //given

        //when
        final String results = FizzBuzzLucky.fizzBuzz(20);

        //then
        assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz", results);
    }

    @Test
    void testContainsThree() {
        assertFalse(FizzBuzzLucky.containsThree(20));
        assertTrue(FizzBuzzLucky.containsThree(33));
    }
}
