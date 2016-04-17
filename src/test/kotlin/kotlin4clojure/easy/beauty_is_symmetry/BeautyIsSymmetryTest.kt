package kotlin4clojure.easy.beauty_is_symmetry

import kotlin.test.assertTrue
import kotlin.test.assertFalse
import org.junit.Test

/**
 * 96. Beauty is Symmetry
 * 
 * Let us define a binary tree as "symmetric" if the left half of the tree is the
 * mirror image of the right half of the tree.
 * Write a predicate to determine whether or not a given binary tree is symmetric.
 */
class BeautyIsSymmetryTest {
    @Test fun f1() {
        val input = Node("a", Node("b"), Node("b"))
        assertTrue(beautyIsSymmetry(input))
    }

    @Test fun f2() {
        val input = Node("a", Node("b"), null)
        assertFalse(beautyIsSymmetry(input))
    }

    @Test fun f3() {
        val input = Node("a", Node("b"), Node("c"))
        assertFalse(beautyIsSymmetry(input))
    }

    @Test fun f4() {
        val input = Node(1, Node(2, null, Node(3, Node(4, Node(5), Node(6)), null)),
                            Node(2, Node(3, null, Node(4, Node(6), Node(5))), null))
        assertTrue(beautyIsSymmetry(input))
    }

    @Test fun f5() {
        val input = Node(1, Node(2, null, Node(3, Node(4, Node(5), Node(6)), null)),
                            Node(2, Node(3, null, Node(4, Node(5), Node(6))), null))
        assertFalse(beautyIsSymmetry(input))
    }

    @Test fun f6() {
        val input = Node(1, Node(2, null, Node(3, Node(4, Node(5), Node(6)), null)),
                            Node(2, Node(3, null, Node(4, Node(6), null)), null))
        assertFalse(beautyIsSymmetry(input))
    }
}
