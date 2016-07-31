package kotlin4clojure.medium.filter_perfect_squares

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 74. Filter Perfect Squares
 * 
 * Given a string of comma separated integers,
 * write a function which returns a new comma separated string that only contains the numbers which are perfect squares.
 */
class FilterPerfectSquaresTest {
    @Test fun f1() {
        assertEquals("4,9", filterPerfectSquares("4,5,6,7,8,9"))
    }

    @Test fun f2() {
        assertEquals("16,25,36", filterPerfectSquares("15,16,25,36,37"))
    }
}
