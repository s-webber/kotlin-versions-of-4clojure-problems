package kotlin4clojure.easy.cartesian_product

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 90. Cartesian Product
 * 
 * Write a function which calculates the Cartesian product of two sets.
 */
class CartesianProductTest {
    @Test fun f1() {
        val expected = setOf(Pair("ace", "♠"), Pair("king", "♠"), Pair("queen", "♠"),
                             Pair("ace", "♥"), Pair("king", "♥"), Pair("queen", "♥"),
                             Pair("ace", "♦"), Pair("king", "♦"), Pair("queen", "♦"),
                             Pair("ace", "♣"), Pair("king", "♣"), Pair("queen", "♣"))
        val actual = cartesianProduct(setOf("ace", "king", "queen"), setOf("♠", "♥", "♦", "♣"))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = setOf(Pair(1, 4), Pair(2, 4), Pair(3, 4), Pair(1, 5), Pair(2, 5), Pair(3, 5))
        val actual = cartesianProduct(setOf(1, 2, 3), setOf(4,5))
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        assertEquals(300, cartesianProduct((0..9).toHashSet(), (0..29).toHashSet()).size)
    }
}
