package kotlin4clojure.hard.number_maze

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 106. Number Maze
 * 
 * Given a pair of numbers, the start and end point, find a path between the two using only three possible operations:
 *
 * * double
 * * halve (odd numbers cannot be halved)
 * * add 2
 *
 * Find the shortest path through the "maze".
 * Because there are multiple shortest paths, you must return the length of the shortest path, not the path itself.
 */
class NumberMazeTest {
    @Test fun f1() {
        assertEquals(1, numberMaze(1, 1))
    }

    @Test fun f2() {
        assertEquals(3, numberMaze(3, 12)) // 3 6 12
    }

    @Test fun f3() {
        assertEquals(3, numberMaze(12, 3)) // 12 6 3
    }

    @Test fun f4() {
        assertEquals(3, numberMaze(5, 9)) // 5 7 9
    }

    @Test fun f5() {
        assertEquals(9, numberMaze(9, 2)) // 9 18 20 10 12 6 8 4
    }

    @Test fun f6() {
        assertEquals(5, numberMaze(9, 12)) // 9 11 22 24 12
    }
}
