package kotlin4clojure.medium.parentheses_again

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 195. Parentheses... Again
 * 
 * In a family of languages like Lisp, having balanced parentheses is a defining feature of the language.
 * Luckily, Lisp has almost no syntax, except for these "delimiters" -
 * and that hardly qualifies as "syntax", at least in any useful computer programming sense.
 *
 * It is not a difficult exercise to find all the combinations of well-formed parentheses
 * if we only have N pairs to work with.
 * For instance, if we only have 2 pairs, we only have two possible combinations: "()()" and "(())".
 * Any other combination of length 4 is ill-formed. Can you see why?
 *
 * Generate all possible combinations of well-formed parentheses of length 2n (n pairs of parentheses).
 * For this problem, we only consider '(' and ')', but the answer is similar if you work with only {} or only [].
 *
 * There is an interesting pattern in the numbers!
 */
class ParenthesesAgainTest {
    @Test fun f1() {
        val expected = listOf(setOf(""), setOf("()"), setOf("()()", "(())"))
        val actual = (0..2).map(::parenthesesAgain)
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = setOf("((()))", "()()()", "()(())", "(())()", "(()())")
        val actual = parenthesesAgain(3)
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        assertEquals(16796, parenthesesAgain(10).size)
    }

    @Test fun f4() {
        val expected = "(((()()()())(())))"
        val actual = parenthesesAgain(9).filter { it.contains("(()()()())") }.sorted().get(6)
        assertEquals(expected, actual)
    }

    @Test fun f5() {
        val expected = "(((((()()()()()))))(()))"
        val actual = parenthesesAgain(12).sorted().get(5000)
        assertEquals(expected, actual)
    }
}
