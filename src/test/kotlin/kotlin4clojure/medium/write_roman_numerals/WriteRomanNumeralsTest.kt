package kotlin4clojure.medium.write_roman_numerals

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 104. Write Roman Numerals
 * 
 * Given an integer smaller than 4000, return the corresponding roman numeral in uppercase,
 * adhering to the subtractive principle.
 */
class WriteRomanNumeralsTest {
    @Test fun f1() {
        assertEquals("I", writeRomanNumerals(1))
    }

    @Test fun f2() {
        assertEquals("XXX", writeRomanNumerals(30))
    }

    @Test fun f3() {
        assertEquals("IV", writeRomanNumerals(4))
    }

    @Test fun f4() {
        assertEquals("CXL", writeRomanNumerals(140))
    }

    @Test fun f5() {
        assertEquals("DCCCXXVII", writeRomanNumerals(827))
    }

    @Test fun f6() {
        assertEquals("MMMCMXCIX", writeRomanNumerals(3999))
    }

    @Test fun f7() {
        assertEquals("XLVIII", writeRomanNumerals(48))
    }
}
