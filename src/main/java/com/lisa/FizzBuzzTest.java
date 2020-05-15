package main.java.com.lisa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FizzBuzzTest {

    @Test
    void goHappyPath() {
        //given

        //when
        final String results = FizzBuzz.fizzBuzz(20);
        final String results2 = FizzBuzz.fizzBuzz(8);

        //then
        assertEquals("1 2 fizz 4 5 fizz 7 8 fizz 10 11 fizz 13 14 fizzbuzz 16 17 fizz 19 20", results);
        assertEquals("1 2 fizz 4 5 fizz 7 8", results2);
    }
}
