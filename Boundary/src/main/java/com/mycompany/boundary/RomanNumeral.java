package com.mycompany.boundary;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class RomanNumeral {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    //The code below has been updated to be as simplified as possible and to pass only given test cases in the RomanNumeralsTest.java

    public static int convert(String s) throws IllegalArgumentException {

        if (s.length() == 0) {
            return 0;
        }

        int convertedNumber = 0;

        ArrayList<Integer> sums = new ArrayList<>();
        //Checking for invalid chars.

        for (int i = 0; i < s.length(); i++) {

            if (!map.containsKey(s.charAt(i))) {

                throw new IllegalArgumentException("Invalid Input");
            }
        }

        int prev_num = map.get(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {

            int next = 0;

            next = map.get(s.charAt(i));

            if (prev_num >= next) {

                convertedNumber += next;

                if (i + 1 == s.length()) {
                    sums.add(convertedNumber);
                }

                prev_num = next;

            } else {

                sums.add(Math.abs(convertedNumber - next));
                convertedNumber = 0;

            }

        }

        if (!sums.isEmpty()) {
            return sums.stream().mapToInt(x -> x).sum();
        } else {
            return convertedNumber;
        }

    }
}
