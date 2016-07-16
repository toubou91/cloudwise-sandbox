package com.cloudwise;

import java.util.TreeMap;

public class RomanNumerals {

    private static final TreeMap<Integer, String> ROMAN_NUMERALS = new TreeMap<Integer, String>();

    static {

        ROMAN_NUMERALS.put(1000, "m");
        ROMAN_NUMERALS.put(900, "cm");
        ROMAN_NUMERALS.put(500, "d");
        ROMAN_NUMERALS.put(400, "cd");
        ROMAN_NUMERALS.put(100, "c");
        ROMAN_NUMERALS.put(90, "xc");
        ROMAN_NUMERALS.put(50, "l");
        ROMAN_NUMERALS.put(40, "xl");
        ROMAN_NUMERALS.put(10, "x");
        ROMAN_NUMERALS.put(9, "ix");
        ROMAN_NUMERALS.put(5, "v");
        ROMAN_NUMERALS.put(4, "iv");
        ROMAN_NUMERALS.put(1, "i");

    }

    public String convert(int input) {
        int l = ROMAN_NUMERALS.floorKey(input);
        if (input == l) {
            return ROMAN_NUMERALS.get(input);
        }
        return ROMAN_NUMERALS.get(l) + convert(input - l);
    }

}
