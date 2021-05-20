package com.corydorfner;

import java.util.Hashtable;
import java.util.Map;

final class RomanConverter {

    private static final Map<Character, Integer> romanSymbols = new Hashtable<>() {
        private static final long serialVersionUID = 1L;
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    private RomanConverter() {
    }

    static int convertRomanToArabicNumber(String roman){
        roman = roman.toUpperCase();
        int sum = 0, current = 0, previous = 0;
        for(int index = roman.length() - 1; index >= 0; index--){
            if(doesSymbolsContainsRomanCharacter(roman, index)){
                current = getSymbolValue(roman, index);
                if(current < previous){
                    sum -= current;
                }else {
                    sum += current;
                }
                previous = current;
            }else {
                throw new IllegalArgumentException(String.format("Illegal roman character %s", getCharValue(roman, index)));
            }
        }
        return sum;
    }

    private static boolean doesSymbolsContainsRomanCharacter(String roman, int index) {
        return romanSymbols.containsKey(getCharValue(roman, index));
    }

    private static Integer getSymbolValue(String roman, int index) {
        return romanSymbols.get(getCharValue(roman, index));
    }

    private static char getCharValue(String roman, int index) {
        return roman.charAt(index);
    }
}
