package kotlin4clojure.hard.tree_reparenting

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 130. Tree reparenting
 * 
 * Every node of a tree is connected to each of its children as well as its parent.
 * One can imagine grabbing one node of a tree and dragging it up to the root position, leaving all connections intact.
 * For example, below on the left is a binary tree. By pulling the "c" node up to the root,
 * we obtain the tree on the right.
 *
 *        a               c
 *    ---------        --------
 *    b       i        d  e   b
 *  -----   -----           -----
 *  c   f   j   m           f   a
 * --- --- --- ---         ---  -
 * d e g h k l n o         g h  i
 *                            -----
 *                            j   m
 *                           --- ---
 *                           k l n o
 *
 * Note it is no longer binary as "c" had three connections total - two children and one parent.
 * Because the children are ordered it's important that the tree you return keeps the children of each node in order
 * and that the old parent node, if any, is appended on the right. Your function will be given two args -
 * the name of the node that should become the new root, and the tree to transform.
 */
class TreeReparentingTest {
    @Test fun f1() {
        val expected = Node("n")
        val actual = treeReparenting("n", Node("n"))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = treeOf("a", treeOf("t", treeOf("e")))
        val actual = treeReparenting("a", treeOf("t", treeOf("e"), treeOf("a")))
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = treeOf("e", treeOf("t", treeOf("a")))
        val actual = treeReparenting("e", treeOf("a", treeOf("t", treeOf("e"))))
        assertEquals(expected, actual)
    }

    @Test fun f4() {
        val expected = treeOf("a", treeOf("b", Node("c")))
        val actual = treeReparenting("a", treeOf("c", treeOf("b", treeOf("a"))))
        assertEquals(expected, actual)
    }

    @Test fun f5() {
        val expected = treeOf("d",
                           treeOf("b",
                               treeOf("c"),
                               treeOf("e"),
                               treeOf("a",
                                   treeOf("f",
                                       treeOf("g"),
                                       treeOf("h")))))
        val input = treeOf("a",
                        treeOf("b",
                            treeOf("c"),
                            treeOf("d"),
                            treeOf("e")),
                        treeOf("f",
                            treeOf("g"),
                            treeOf("h")))
        val actual = treeReparenting("d", input)
        assertEquals(expected, actual)
    }

    @Test fun f6() {
        val expected = treeOf("c",
                           treeOf("d"),
                           treeOf("e"),
                           treeOf("b",
                               treeOf("f",
                                   treeOf("g"),
                                   treeOf("h")),
                               treeOf("a",
                                   treeOf("i",
                                       treeOf("j",
                                           treeOf("k"),
                                           treeOf("l")),
                                       treeOf("m",
                                           treeOf("n"),
                                           treeOf("o"))))))
        val input = treeOf("a",
                        treeOf("b",
                            treeOf("c",
                                treeOf("d"),
                                treeOf("e")),
                            treeOf("f",
                                treeOf("g"),
                                treeOf("h"))),
                        treeOf("i",
                            treeOf("j",
                                treeOf("k"),
                                treeOf("l")),
                            treeOf("m",
                                treeOf("n"),
                                treeOf("o"))))
        val actual = treeReparenting("c", input)
        assertEquals(expected, actual)
    }
}
