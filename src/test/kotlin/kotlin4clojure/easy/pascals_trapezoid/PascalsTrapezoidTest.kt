package kotlin4clojure.easy.pascals_trapezoid

import kotlin.test.assertEquals
import org.junit.Test
import java.math.BigInteger

/**
 * 147. Pascal's Trapezoid
 * 
 * Write a function that, for any given input list of numbers, returns an infinite lazy sequence of lists,
 * where each next one is constructed from the previous following the rules used in Pascal's Triangle.
 * For example, for [3 1 2], the next row is [3 4 3 2].
 */
class PascalsTrapezoidTest {
    @Test fun f1() {
        val expected = bigInts(2, 5, 5, 2)
        val seq = pascalsTrapezoid(bigInts(2, 3, 2))
        assertEquals(expected, seq.drop(1).first())
    }

    @Test fun f2() {
        val expected = sequenceOf(bigInts(1),
                                  bigInts(1, 1),
                                  bigInts(1, 2, 1),
                                  bigInts(1, 3, 3, 1),
                                  bigInts(1, 4, 6, 4, 1))
        val seq = pascalsTrapezoid(bigInts(1))
        assertEquals(expected, seq.take(5))
    }

    @Test fun f3() {
        val expected = sequenceOf(bigInts(3, 1, 2),
                                  bigInts(3, 4, 3, 2))
        val seq = pascalsTrapezoid(bigInts(3, 1, 2))
        assertEquals(expected, seq.take(2))
    }

    @Test fun f4() {
        val a = pascalsTrapezoid(bigInts(2, 4, 2))
        val b = pascalsTrapezoid(bigInts(2, 2))
        assertEquals(a.take(100), b.take(101).drop(1))
    }

    fun bigInts(vararg input: Int) = input.map { BigInteger(it.toString()) }.toList()
}
