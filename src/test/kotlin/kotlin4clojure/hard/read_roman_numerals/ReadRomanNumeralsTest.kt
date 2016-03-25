package kotlin4clojure.hard.read_roman_numerals

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 92. Read Roman numerals
 * 
 * Roman numerals are easy to recognize, but not everyone knows all the rules necessary to work with them.
 * Write a function to parse a Roman-numeral string and return the number it represents.
 *
 * You can assume that the input will be well-formed, in upper-case, and follow the subtractive principle.
 * You don't need to handle any numbers greater than MMMCMXCIX (3999),
 * the largest number representable with ordinary letters.
 */
class ReadRomanNumeralsTest {
    @Test fun f1() {
        assertEquals(14, readRomanNumerals("XIV"))
    }

    @Test fun f2() {
        assertEquals(827, readRomanNumerals("DCCCXXVII"))
    }

    @Test fun f3() {
        assertEquals(3999, readRomanNumerals("MMMCMXCIX"))
    }

    @Test fun f4() {
        assertEquals(48, readRomanNumerals("XLVIII"))
    }
}
