package kotlin4clojure.util

import org.junit.Test
import kotlin.test.assertEquals

class ToDigitsTest {
    @Test fun singleDigit() {
        assertEquals(listOf(7), 7.toDigits().toList())
    }

    @Test fun twoDigits() {
        assertEquals(listOf(0, 1), 10.toDigits().toList())
    }

    @Test fun threeIdenticalDigits() {
        assertEquals(listOf(9, 9, 9), 999.toDigits().toList())
    }

    @Test fun multipleDigits() {
        assertEquals(listOf(1, 6, 3, 4, 8, 7, 5, 2, 9), 925784361.toDigits().toList())
    }
}
