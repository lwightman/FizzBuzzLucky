package com.lisa;

public class FizzBuzzLucky {
    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";
    private static final String SPACE = " ";
    private static final String LUCKY = "lucky";

    static String fizzBuzz(final int input) {
        StringBuilder results = new StringBuilder();
        int number = 1;

        while(number <= input) {
            if(containsThree(number)){
                results.append(LUCKY);
            } else if (number % 3 == 0 && number % 5 ==0) {
                results.append(FIZZ + BUZZ);
            } else if (number % 3 == 0) {
                results.append(FIZZ);
            } else if(number % 5 == 0) {
                results.append(BUZZ);
            } else {
                results.append(number);
            }
            results.append(SPACE);
            number++;
        }

        return results.toString().trim();
    }

    static boolean containsThree(int number) {
        return Integer.toString(number).contains("3");
    }

    public static void main(String[] args) {
        String results = fizzBuzz(20);
        System.out.println(results);
    }
}
