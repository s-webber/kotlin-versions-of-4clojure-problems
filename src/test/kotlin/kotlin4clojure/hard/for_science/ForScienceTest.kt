package kotlin4clojure.hard.for_science

import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.junit.Test

/**
 * 117. For Science!
 * 
 * A mad scientist with tenure has created an experiment tracking mice in a maze.
 * Several mazes have been randomly generated, and you've been tasked with writing a program to
 * determine the mazes in which it's possible for the mouse to reach the cheesy endpoint.
 * Write a function which accepts a maze in the form of a collection of rows, each row is a string where:
 *
 * * spaces represent areas where the mouse can walk freely
 * * hashes (#) represent walls where the mouse can not walk
 * * M represents the mouse's starting point
 * * C represents the cheese which the mouse must reach
 *
 * The mouse is not allowed to travel diagonally in the maze (only up/down/left/right),
 * nor can he escape the edge of the maze. Your function must return true iff the maze is solvable by the mouse.
 */
class ForScienceTest {
    @Test fun f1() {
        assertTrue(forScience("M   C"))
    }

    @Test fun f2() {
        assertFalse(forScience("M # C"))
    }

    @Test fun f3() {
        assertTrue(forScience("#######",
                              "#     #",
                              "#  #  #",
                              "#M # C#",
                              "#######"))
    }

    @Test fun f4() {
        assertFalse(forScience("########",
                               "#M  #  #",
                               "#   #  #",
                               "# # #  #",
                               "#   #  #",
                               "#  #   #",
                               "#  # # #",
                               "#  #   #",
                               "#  #  C#",
                               "########"))
    }

    @Test fun f5() {
        assertFalse(forScience("M     ",
                               "      ",
                               "      ",
                               "      ",
                               "    ##",
                               "    #C"))
    }

    @Test fun f6() {
        assertTrue(forScience("C######",
                              " #     ",
                              " #   # ",
                              " #   #M",
                              "     # "))
    }

    @Test fun f7() {
        assertTrue(forScience("C# # # #",
                              "        ",
                              "# # # # ",
                              "        ",
                              " # # # #",
                              "        ",
                              "# # # #M"))
    }
}
