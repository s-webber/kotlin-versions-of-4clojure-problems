package kotlin4clojure.medium.lazy_searching

import kotlin.test.assertEquals
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
        val input = sequenceOf(3, 4, 5)
        assertEquals(3, lazySearching(input))
    }

    @Test fun f2() {
        val a = sequenceOf(1, 2, 3, 4, 5, 6, 7)
        val b = sequenceOf(0, 4, 19)
        assertEquals(4, lazySearching(a, b))
    }

    @Test fun f3() {
        val a = infiniteRange()
        val b = infiniteRange().map { it * it }
        val c = sequenceOf(20, 30, 50, 70, 100, 130)
        assertEquals(100, lazySearching(a, b, c))
    }

    @Test fun f4() {
        val perfectCubes = infiniteRange().map { it * it * it }
        val powersOf2 = infiniteRange().filter { it and (it - 1) == 0 }
        val atLeastAsLargeAs20 = infiniteRange(20)
        assertEquals(64, lazySearching(perfectCubes, powersOf2, atLeastAsLargeAs20))
    }

    fun infiniteRange(start: Int = 1) : Sequence<Int> {
        return generateSequence(start, {it + 1})
    }
}
