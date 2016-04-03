package kotlin4clojure.medium.function_composition

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.Test

/**
 * 58. Function Composition
 * 
 * Write a function which allows you to create function compositions.
 * The function should take two functions, and create a function that applies them in order.
 */
class FunctionCompositionTest {
    @Test fun f1() {
        val input = listOf(1, 2, 3, 4)
        fun rest(x: List<Any>) = x.drop(1)
        fun reverse(x: List<Any>) = x.asReversed()
        val composite = ::reverse + ::rest
        assertEquals(listOf(3, 2, 1), composite.invoke(input))
    }

    @Test fun f2() {
        val input = listOf(1, 2, 3, 4)
        fun second(x: List<Int>) = x[1]
        fun add3(x: Int) = x + 3
        val composite = ::second + ::add3
        assertEquals(5, composite.invoke(input))
    }

    @Test fun f3() {
        val input = listOf(3, 5, 7, 9)
        fun sum(x: List<Int>) = x.sum()
        fun mod8(x: Int) = x % 8
        fun isZero(x: Int) = x == 0
        val composite = ::sum + ::mod8 + ::isZero
        assertTrue(composite.invoke(input))
    }

    @Test fun f4() {
        val input = "hello world"
        fun take5(x: String) = x.take(5)
        fun toUpperCase(x: String) = x.toUpperCase()
        val composite = ::take5 + ::toUpperCase
        assertEquals("HELLO", composite.invoke(input))
    }
}
