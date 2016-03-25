package kotlin4clojure.hard.graph_tour

import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.junit.Test

/**
 * 89. Graph Tour
 * 
 * Starting with a graph you must write a function that returns true if it is possible to make a tour of the graph in
 * which every edge is visited exactly once.
 *
 * The graph is represented by an array of tuples, where each tuple represents a single edge.
 *
 * The rules are:
 *
 * * You can start at any node.
 * * You must visit each edge exactly once.
 * * All edges are undirected.
 */
class GraphTourTest {
    @Test fun f1() {
        assertTrue(graphTour("a" to "b"))
    }

    @Test fun f2() {
        assertFalse(graphTour("a" to "a", "b" to "b"))
    }

    @Test fun f3() {
        assertFalse(graphTour("a" to "b", "a" to "b", "a" to "c", "c" to "a",
                              "a" to "d", "b" to "d", "c" to "d"))
    }

    @Test fun f4() {
        assertTrue(graphTour(1 to 2, 2 to 3, 3 to 4, 4 to 1))
    }

    @Test fun f5() {
        assertTrue(graphTour("a" to "b", "a" to "c", "c" to "b", "a" to "e",
                             "b" to "e", "a" to "d", "b" to "d", "c" to "e",
                             "d" to "e", "c" to "f", "d" to "f"))
    }

    @Test fun f6() {
        assertFalse(graphTour(1 to 2, 2 to 3, 2 to 4, 2 to 5))
    }
}
