package com.anna.java.app.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericMethods {

    static Character[] charArray = {'h', 'e', 'l', 'o'};
    static Integer[] intArray = {1, 3, 5};
    static Boolean[] boolArray = {false, true, true};

    public static List arrayToList(Object[] array, List<Object> list) {
        Collections.addAll(list, array);
        return list;
    }

    //first <T> declares T type for the scope of this method
    public static <T> List<T> arrayToListImproved(T[] array, List<T> list) {

        //or list.addAll(Arrays.asList(array));
        for(T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        List<String> boolList = arrayToList(boolArray, new ArrayList<>());

        List<Character> charList1 = arrayToListImproved(charArray, new ArrayList<Character>());
        List<Integer> intList2 = arrayToListImproved(intArray, new ArrayList<Integer>());
        //List<String> boolList3 = arrayToListImproved(boolArray, new ArrayList<String>());

        System.out.println(charList.get(0));
        System.out.println(intList.get(0));
        //ClassCastException because of String and then with T it is a compilation issue
        System.out.println(boolList.get(0));
        // System.out.println(boolList3.get(0));
    }
}
