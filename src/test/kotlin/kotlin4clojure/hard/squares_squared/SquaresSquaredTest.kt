package kotlin4clojure.hard.squares_squared

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 138. Squares Squared
 * 
 * Create a function of two integer arguments: the start and end, respectively.
 * You must create a list of strings which renders a 45° rotated square of integers which are successive squares from
 * the start point up to and including the end point.
 * If a number comprises multiple digits, wrap them around the shape individually.
 * If there are not enough digits to complete the shape, fill in the rest with asterisk characters.
 * The direction of the drawing should be clockwise, starting from the center of the shape and working outwards,
 * with the initial direction being down and to the right.
 */
class SquaresSquaredTest {
    @Test fun f1() {
        val expected = listOf("2")
        val actual = squaresSquared(2, 2)
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf(" 2 ",
                              "* 4",
                              " * ")
        val actual = squaresSquared(2, 4)
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(" 3 ",
                              "1 9",
                              " 8 ")
        val actual = squaresSquared(3, 81)
        assertEquals(expected, actual)
    }

    @Test fun f4() {
        val expected = listOf(" 4 ",
                              "* 1",
                              " 6 ")
        val actual = squaresSquared(4, 20)
        assertEquals(expected, actual)
    }

    @Test fun f5() {
        val expected = listOf("  6  ",
                              " 5 * ",
                              "2 2 *",
                              " 6 4 ",
                              "  1  ")
        val actual = squaresSquared(2, 256)
        assertEquals(expected, actual)
    }

    @Test fun f6() {
        val expected = listOf("   0   ",
                              "  1 0  ",
                              " 0 1 0 ",
                              "* 0 0 0",
                              " * 1 * ",
                              "  * *  ",
                              "   *   ")
        val actual = squaresSquared(10, 10000)
        assertEquals(expected, actual)
    }

    @Test fun diamondCoordsTest() {
        val expected = listOf(0 to 0, 1 to 1, 0 to 2, -1 to 1, -2 to 0, -1 to -1, 0 to -2, 1 to -1,
                              2 to 0, 3 to 1, 2 to 2, 1 to 3, 0 to 4, -1 to 3, -2 to 2, -3 to 1)
        assertEquals(expected, diamondCoords.take(16).toList())
    }
}
