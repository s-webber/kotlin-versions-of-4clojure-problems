package kotlin4clojure.easy.read_a_binary_number

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 122. Read a binary number
 * 
 * Convert a binary number, provided in the form of a string, to its numerical value.
 */
class ReadBinaryNumberTest {
    @Test fun f1() {
        assertEquals(0, readBinaryNumber("0"))
    }

    @Test fun f2() {
        assertEquals(7, readBinaryNumber("111"))
    }

    @Test fun f3() {
        assertEquals(8, readBinaryNumber("1000"))
    }

    @Test fun f4() {
        assertEquals(9, readBinaryNumber("1001"))
    }

    @Test fun f5() {
        assertEquals(255, readBinaryNumber("11111111"))
    }

    @Test fun f6() {
        assertEquals(1365, readBinaryNumber("10101010101"))
    }

    @Test fun f7() {
        assertEquals(65535, readBinaryNumber("1111111111111111"))
    }
}
