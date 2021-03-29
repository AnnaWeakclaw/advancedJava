package com.anna.java.app.codeWars;

import java.util.stream.IntStream;

public class DRoot {

//    Digital root is the recursive sum of all the digits in a number.
    public static void main(String[] args) {
        System.out.println(digital_root(456));
        System.out.println(digital_root_better(456));

    }

    public static int digital_root(int n) {
        int[] ints = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
        int result = IntStream.of(ints).sum();
        while (result > 9) {

            ints = String.valueOf(result).chars().map(Character::getNumericValue).toArray();
            result = IntStream.of(ints).sum();
        };
        return result;
    }

    public static int digital_root_better(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }
}
