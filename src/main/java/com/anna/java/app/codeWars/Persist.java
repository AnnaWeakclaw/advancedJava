package com.anna.java.app.codeWars;

import java.util.stream.IntStream;

public class Persist {
    //    Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
//    which is the number of times you must multiply the digits in num until you reach a single digit.
    public static void main(String[] args) {
        System.out.println(persistence(25));
        System.out.println(persistence_better(25));
    }

    public static int persistence(long n) {
        int[] digits = getDigitsFromInt(String.valueOf(n));
        int counter = multiplyWithReduce(digits);

        return digits.length < 2 ? 0 : getHowManyTimesINeedToMultiplyDigits(digits, counter);
    }

    private static int getHowManyTimesINeedToMultiplyDigits(int[] digits, int counter) {
        int howManyTimesINeedToMultiplyDigits = 0;
        while (digits.length > 1) {
            howManyTimesINeedToMultiplyDigits = howManyTimesINeedToMultiplyDigits + 1;
            digits = getDigitsFromInt(String.valueOf(counter));
            counter = multiplyWithReduce(digits);
        }
        return howManyTimesINeedToMultiplyDigits;
    }

    private static int[] getDigitsFromInt(String s) {
        return s.chars().map(Character::getNumericValue).toArray();
    }

    private static int multiplyWithReduce(int[] digits) {
        return IntStream.of(digits).reduce(1, (a, b) -> a * b);
    }

    //OR....
    public static int persistence_better(long n) {
        if (n < 10) {
            return 0;
        }
        return 1 + persistence_better(multiplyDigits(n));
    }
    /**
     * given an integer produce the product of the given integers digits.
     * example: multiplyDigits(785) = 7 * 8 * 5 = 280
     * @param n
     * @return the product of the digits that comprise n
     */
    private static long multiplyDigits(long n) {
        if (n < 10) {
            System.out.println("hello " + n);
            return n;
        }
        long l = multiplyDigits(n / 10);
        System.out.println("L " + l);
        long myValue = n % 10 * l;

        System.out.println("Value " + myValue);
        return myValue;
    }
}
