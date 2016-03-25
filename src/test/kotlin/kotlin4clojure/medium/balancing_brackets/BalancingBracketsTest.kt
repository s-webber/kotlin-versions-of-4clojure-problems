package kotlin4clojure.medium.balancing_brackets

import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.junit.Test

/**
 * 177. Balancing Brackets
 * 
 * When parsing a snippet of code it's often a good idea to do a sanity check to see if all the brackets match up.
 * Write a function that takes in a string and returns true if all square [ ] round ( ) and curly { } brackets
 * are properly paired and legally nested, or returns false otherwise.
 */
class BalancingBracketsTest {
    @Test fun f1() {
        assertTrue(balance("This string has no brackets."))
    }

    @Test fun f2() {
        assertTrue(balance("""class Test {
                                  public static void main(String[] args) {
                                      System.out.println(\"Hello world.\");
                                  }
                              }"""))
    }

    @Test fun f3() {
        assertFalse(balance("(start, end]"))
    }

    @Test fun f4() {
        assertFalse(balance("())"))
    }

    @Test fun f5() {
        assertFalse(balance("[ { ] } "))
    }

    @Test fun f6() {
        assertTrue(balance("([]([(()){()}(()(()))(([[]]({}()))())]((((()()))))))"))
    }

    @Test fun f7() {
        assertFalse(balance("([]([(()){()}(()(()))(([[]]({}([)))())]((((()()))))))"))
    }

    @Test fun f8() {
        assertFalse(balance("["))
    }
}
