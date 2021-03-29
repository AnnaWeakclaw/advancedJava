package com.anna.java.app.generics;

public class Varargs {

    public static void main(String[] args) {
        String item1 = "Milk";
        String item2 = "Apples";
        String item3 = "Eggs";
        String[] moreStuff = {"Bread,"};

        printShoppingList(item1, item2, item3);
        printShoppingList(item1);
    }

    private static void printShoppingList(String... items) {
        System.out.println("SHOPPING");
        for(int i = 0; i < items.length; i++ ) {
            System.out.println(i + 1 + ": " + items[i]);
        }
        System.out.println();
    }
}
