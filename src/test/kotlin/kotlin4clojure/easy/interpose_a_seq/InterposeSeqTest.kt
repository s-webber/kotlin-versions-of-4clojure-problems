package kotlin4clojure.easy.interpose_a_seq

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 40. Interpose a Seq
 * 
 * Write a function which separates the items of a sequence by an arbitrary value.
 */
class InterposeSeqTest {
    @Test fun f1() {
        val expected = sequenceOf(1, 0, 2, 0, 3)
        val actual = interposeSeq(0, sequenceOf(1, 2, 3))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = sequenceOf("one", ",", "two", ",", "three")
        val actual = interposeSeq(",", sequenceOf("one", "two", "three"))
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = sequenceOf('a', 'z', 'b', 'z', 'c', 'z', 'd')
        val actual = interposeSeq('z', sequenceOf('a', 'b', 'c', 'd'))
        assertEquals(expected, actual)
    }
}
