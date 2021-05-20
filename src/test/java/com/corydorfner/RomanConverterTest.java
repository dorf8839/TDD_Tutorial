package com.corydorfner;

import org.junit.jupiter.api.Test;

import static com.corydorfner.RomanConverter.convertRomanToArabicNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanConverterTest {

    @Test
    void convertI(){
        assertEquals(1, convertRomanToArabicNumber("I"));
    }

    @Test
    void convertII(){
        assertEquals(2, convertRomanToArabicNumber("II"));
    }

    @Test
    void convertIII(){
        assertEquals(3, convertRomanToArabicNumber("III"));
    }

    @Test
    void convertV(){
        assertEquals(5, convertRomanToArabicNumber("V"));
    }

    @Test
    void convertVI(){
        assertEquals(6, convertRomanToArabicNumber("VI"));
    }

    @Test
    void convertIV(){
        assertEquals(4, convertRomanToArabicNumber("IV"));
    }

    @Test
    void convertX(){
        assertEquals(10, convertRomanToArabicNumber("X"));
    }

    @Test
    void convertIX(){
        assertEquals(9, convertRomanToArabicNumber("IX"));
    }

    @Test
    void convertXXXVI(){
        assertEquals(36, convertRomanToArabicNumber("XXXVI"));
    }

    @Test
    void convertMMXII(){
        assertEquals(2012, convertRomanToArabicNumber("MMXII"));
    }

    @Test
    void convertMCMXCVI(){
        assertEquals(1996, convertRomanToArabicNumber("MCMXCVI"));
    }

    @Test
    void convertInvalidRomanValue(){
        assertThrows(
                IllegalArgumentException.class,
                () -> convertRomanToArabicNumber("Z"),
                "Invalid roman character Z Should throw (IllegalArgumentException)");
    }

    @Test
    void convertVII() {
        assertEquals(7, convertRomanToArabicNumber("vii"), "Roman VII should equal to 7");
    }
}
