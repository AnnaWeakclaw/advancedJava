package com.anna.java.app.codeWars;


import java.lang.reflect.Array;
import java.util.Arrays;

public class WhoLikesIt {

    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Me"));
        System.out.println(whoLikesIt("Gary", "Sally", "Ed"));
        System.out.println(whoLikesIt("Gary", "Sally"));
        System.out.println(whoLikesIt("Gary", "Sally", "Ed", "Emma"));

        System.out.println(whoLikesIt_better("Gary", "Sally", "Ed", "Emma"));
        System.out.println(whoLikesIt_better("Gary", "Sally", "Ed", "Emma"));


    }

    public static String whoLikesIt(String... names) {
        StringBuilder namesAnd = new StringBuilder();
        if (names.length == 0) {
            return "no one likes this";
        } else if (names.length == 1) {
            return Arrays.stream(names).findFirst().get() + " likes this";
        } else if (names.length == 2 ){
            for (int i = 0; i < names.length; i++) {
                namesAnd.append((String) Array.get(names, i)).append(" and ");
            }
            return namesAnd.replace(namesAnd.lastIndexOf("and"), namesAnd.lastIndexOf("and") + 3, "like this").toString();
        } else if (names.length == 3)
            return namesAnd.append(Array.get(names, 0)).append(", ").append(Array.get(names, 1)).append(" and ").append(Array.get(names, 2)).append(" like this").toString();

        else
            return namesAnd.append(Array.get(names, 0)).append(", ").append(Array.get(names, 1)).append(" and ").append(names.length - 2).append(" others like this").toString();

    }

    public static String whoLikesIt_better(String... names) {
        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return String.format("%s likes this", names[0]);
            case 2: return String.format("%s and %s like this", names[0], names[1]);
            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }
}
