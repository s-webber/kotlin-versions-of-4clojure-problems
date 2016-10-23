package kotlin4clojure.util

import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals

class BigIntTest {
    @Test fun intToBigInt() {
        assertEquals(BigInteger("42"), bigInt(42))
    }

    @Test fun stringToBigInt() {
        assertEquals(BigInteger("2147483648"), bigInt("2147483648"))
        assertEquals(BigInteger("-2147483649"), bigInt("-2147483649"))
    }

    @Test fun intsToBigInts() {
        val expected = listOf(BigInteger("2"), BigInteger("-18"), BigInteger("72"))
        val actual = bigInts(2, -18, 72)
        assertEquals(expected, actual)
    }
}
