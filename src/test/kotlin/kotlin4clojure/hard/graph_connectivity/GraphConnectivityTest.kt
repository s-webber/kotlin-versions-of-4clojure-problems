package kotlin4clojure.hard.graph_connectivity

import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.junit.Test

/**
 * 91. Graph Connectivity
 * 
 * Given a graph, determine whether the graph is connected.
 * A connected graph is such that a path exists between any two given nodes.
 *
 * * Your function must return true if the graph is connected and false otherwise.
 * * You will be given a set of tuples representing the edges of a graph.
 *   Each member of a tuple being a vertex/node in the graph.
 * * Each edge is undirected (can be traversed either direction).
 */
class GraphConnectivityTest {
    @Test fun f1() {
        assertTrue(graphConnectivity(setOf("a" to "a")))
    }

    @Test fun f2() {
        assertTrue(graphConnectivity(setOf("a" to "b")))
    }

    @Test fun f3() {
        assertFalse(graphConnectivity(setOf(1 to 2, 2 to 3, 3 to 1,
                                            4 to 5, 5 to 6, 6 to 4)))
    }

    @Test fun f4() {
        assertTrue(graphConnectivity(setOf(1 to 2, 2 to 3, 3 to 1,
                                           4 to 5, 5 to 6, 6 to 4, 3 to 4)))
    }

    @Test fun f5() {
        assertFalse(graphConnectivity(setOf("a" to "b", "b" to "c", "c" to "d",
                                            "x" to "y", "d" to "a", "b" to "e")))
    }

    @Test fun f6() {
        assertTrue(graphConnectivity(setOf("a" to "b", "b" to "c", "c" to "d",
                                           "x" to "y", "d" to "a", "b" to "e", "x" to "a")))
    }
}
