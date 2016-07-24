package kotlin4clojure.medium.lazy_searching

import kotlin.test.assertEquals
import kotlin.test.assertNull
import org.junit.Test

/**
 * 108. Lazy Searching
 * 
 * Given any number of sequences, each sorted from smallest to largest,
 * find the smallest single number which appears in all of the sequences.
 * The sequences may be infinite, so be careful to search lazily.
 */
class LazySearchingTest {
    @Test fun f1() {
        val a = sequenceOf(3, 4, 5)
        val input = listOf(a)
        assertEquals(3, lazySearching(input))
    }

    @Test fun f2() {
        val a = sequenceOf(1, 2, 3, 4, 5, 6, 7)
        val b = sequenceOf(0, 4, 19)
        val input = listOf(a, b)
        assertEquals(4, lazySearching(input))
    }

    @Test fun f3() {
        val a = infiniteRange()
        val b = infiniteRange().map { it * it }
        val c = sequenceOf(20, 30, 50, 70, 100, 130)
        val input = listOf(a, b, c)
        assertEquals(100, lazySearching(input))
    }

    @Test fun f4() {
        val perfectCubes = infiniteRange().map { it * it * it }
        val powersOf2 = infiniteRange().filter { it and (it - 1) == 0 }
        val atLeastAsLargeAs20 = infiniteRange(20)
        val input = listOf(perfectCubes, powersOf2, atLeastAsLargeAs20)
        assertEquals(64, lazySearching(input))
    }

    @Test fun f5() {
        val a = sequenceOf(1, 2, 3, 5, 7, 9)
        val b = sequenceOf(4, 6, 8)
        val c = infiniteRange(10)
        val input = listOf(a, b, c)
        assertNull(lazySearching(input))
    }

    fun infiniteRange(start: Int = 1): Sequence<Int> = generateSequence(start, {it + 1})
}
