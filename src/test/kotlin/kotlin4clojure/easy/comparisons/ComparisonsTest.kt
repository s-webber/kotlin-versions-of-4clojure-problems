package kotlin4clojure.easy.comparisons

import kotlin.test.assertEquals
import org.junit.Test

import kotlin4clojure.easy.comparisons.Relationship.*

/**
 * 166. Comparisons
 * 
 * For any orderable data type it's possible to derive all of the basic comparison operations (<, ≤, =, ≠, ≥, and >)
 * from a single operation (any operator but = or ≠ will work).
 * Write a function that takes three arguments, a less than operator for the data and two items to compare.
 * The function should return a value describing the relationship between the two items.
 * The enum values for the relationship between x and y are as follows:
 *
 * * x = y → EQ
 * * x > y → GT
 * * x < y → LT
 */
class ComparisonsTest {
    @Test fun f1() {
        assertEquals(GT, comparison({x, y -> x < y}, 5, 1))
    }

    @Test fun f2() {
        assertEquals(EQ, comparison({x, y -> x.length < y.length}, "pear", "plum"))
    }

    @Test fun f3() {
        assertEquals(LT, comparison({x, y -> (x % 5) < (y % 5)}, 21, 3))
    }

    @Test fun f4() {
        assertEquals(GT, comparison({x, y -> x > y}, 0, 2))
    }
}
