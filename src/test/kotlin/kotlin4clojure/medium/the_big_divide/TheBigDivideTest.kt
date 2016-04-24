package kotlin4clojure.medium.the_big_divide

import kotlin.test.assertEquals
import org.junit.Test
import java.math.BigInteger

/**
 * 148. The Big Divide
 * 
 * Write a function which calculates the sum of all natural numbers under n (first argument) which are evenly divisible
 * by at least one of a and b (second and third argument). Numbers a and b are guaranteed to be coprimes.
 */
class TheBigDivideTest {
    @Test fun f1() {
        val expected = bigInt(0)
        val actual = bigDivide(bigInt(3), bigInt(7), bigInt(11))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = bigInt(23)
        val actual = bigDivide(bigInt(10), bigInt(3), bigInt(5))
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = bigInt(233168)
        val actual = bigDivide(bigInt(1000), bigInt(3), bigInt(5))
        assertEquals(expected, actual)
    }

    @Test fun f4() {
        val expected = bigInt("2333333316666668")
        val actual = bigDivide(bigInt(100000000), bigInt(3), bigInt(5))
        assertEquals(expected, actual)
    }

    @Test fun f5() {
        val expected = bigInt("110389610389889610389610")
        val actual = bigDivide(bigInt("1000000000000"), bigInt(7), bigInt(11))
        assertEquals(expected, actual)
    }

    @Test fun f6() {
        val expected = bigInt("1277732511922987429116")
        val actual = bigDivide(bigInt("1000000000000"), bigInt(757), bigInt(809))
        assertEquals(expected, actual)
    }

    @Test fun f7() {
        val expected = bigInt("4530161696788274281")
        val actual = bigDivide(bigInt("1000000000000"), bigInt(1597), bigInt(3571))
        assertEquals(expected, actual)
    }

    fun bigInt(n: Any) = BigInteger(n.toString())
}
