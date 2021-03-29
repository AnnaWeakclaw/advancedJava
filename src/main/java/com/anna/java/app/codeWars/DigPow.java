package com.anna.java.app.codeWars;

import java.util.ArrayList;
import java.util.List;

public class DigPow {

    public static void main(String[] args) {
        System.out.println(digPow(695, 2));
    }

    public static long digPow(int n, int p) {
        String number = String.valueOf(n);
        char[] digits = number.toCharArray();
        List<Integer> properDigits = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < digits.length; i++) {
            properDigits.add(Character.getNumericValue(digits[i]));
            total+=Math.pow(properDigits.get(i), p +i);
        }
        if (total % n == 0) {
            return total/n;
        }
        return -1;
    }

}
