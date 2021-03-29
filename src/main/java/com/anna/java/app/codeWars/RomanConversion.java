package com.anna.java.app.codeWars;

public class RomanConversion {
    public static void main(String[] args) {
        System.out.println(solution(1));
    }

    public static String solution(int n) {
//        3456 MMM + CD + L + VI
        String whatIWillReturn = "";
        int thousands = n / 1000;
        int hundreds = n % 1000;
        int tens = n % 100;
        int rest = n % 10;
        if (thousands > 0 && thousands <= 3) {
            for(int i = 0; i < thousands; i++ ) {
                whatIWillReturn = whatIWillReturn + Numbers.THOUSAND.roman;
            }
        }
        return "";
    }

    public enum Numbers {

        ONE_ONE("I", 1),
        FIVE("V", 5),
        TEN("X", 10),
        FIFTY("L", 50),
        HUNDRED("C", 100),
        FIVE_HUNDRED("D", 500),
        THOUSAND("M", 1000);

        private final String roman;
        private final int decimal;

        Numbers(String roman, int decimal) {
            this.decimal = decimal;
            this.roman = roman;
        }

        public String getRoman() {
            return roman;
        }


    }
}
