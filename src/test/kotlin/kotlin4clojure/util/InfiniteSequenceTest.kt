package kotlin4clojure.util

import org.junit.Test
import kotlin.test.assertEquals

class InfiniteSequenceTest {
    @Test fun defaultStart() {
        val expected = (0..100).toList()
        val actual = infiniteSequence().take(101).toList()
        assertEquals(expected, actual)
    }

    @Test fun specifyStart() {
        val expected = (20..120).toList()
        val actual = infiniteSequence(20).take(101).toList()
        assertEquals(expected, actual)
    }
}
