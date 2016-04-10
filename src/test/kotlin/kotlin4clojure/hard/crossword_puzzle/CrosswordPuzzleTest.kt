package kotlin4clojure.hard.crossword_puzzle

import kotlin.test.assertTrue
import kotlin.test.assertFalse
import org.junit.Test

/**
 * 111. Crossword puzzle
 *
 * Write a function that takes a string and a partially-filled crossword puzzle board, and determines if the input
 * string can be legally placed onto the board.
 *
 * The crossword puzzle board consists of a collection of partially-filled rows.
 * Empty spaces are denoted with an underscore (_), unusable spaces are denoted with a hash symbol (#),
 * and pre-filled spaces have a character in place; the whitespace characters are for legibility and should be ignored.
 *
 * For a word to be legally placed on the board:
 * - It may use empty spaces (underscores)
 * - It may use but must not conflict with any pre-filled characters.
 * - It must not use any unusable spaces (hashes).
 * - There must be no empty spaces (underscores) or extra characters before or after the word
 *   (the word may be bound by unusable spaces though).
 * - Characters are not case-sensitive.
 * - Words may be placed vertically (proceeding top-down only), or horizontally (proceeding left-right only).
 */
class CrosswordPuzzleTest {
    @Test fun f1() {
        val grid = listOf("_ # _ _ e")
        assertTrue(crosswordPuzzle("the", grid))
    }

    @Test fun f2() {
        val grid = listOf("c _ _ _",
                          "d _ # e",
                          "r y _ _")
        assertFalse(crosswordPuzzle("the", grid))
    }

    @Test fun f3() {
        val grid = listOf("c _ _ _",
                          "d _ # e",
                          "r y _ _")
        assertTrue(crosswordPuzzle("joy", grid))
    }

    @Test fun f4() {
        val grid = listOf("c o n j",
                          "_ _ y _",
                          "r _ _ #")
        assertFalse(crosswordPuzzle("joy", grid))
    }

    @Test fun f5() {
        val grid = listOf("_ _ _ # j o y",
                          "_ _ o _ _ _ _",
                          "_ _ f _ # _ _")
        assertTrue(crosswordPuzzle("clojure", grid))
    }
}
