package kotlin4clojure.hard.love_triangle

import kotlin.test.assertEquals
import kotlin.test.assertNull
import org.junit.Test

/**
 * 127. Love Triangle
 * 
 * Everyone loves triangles, and it's easy to understand why - they're so wonderfully symmetric
 * (except scalenes, they suck).
 *
 * Your passion for triangles has led you to become a miner where you work all day to chip out isosceles-shaped minerals
 * from rocks gathered in a nearby open-pit mine. There are too many rocks coming from the mine to harvest them all so
 * you've been tasked with writing a program to analyze the mineral patterns of each rock,
 * and determine which rocks have the biggest minerals.
 *
 * Someone has already written a computer-vision system for the mine. It images each rock as it comes into the
 * processing centre and creates a cross-sectional bitmap of mineral (1) and rock (0) concentrations for each one.
 *
 * You must now create a function which accepts a collection of integers, each integer when read in base-2 gives the
 * bit-representation of the rock (again, 1s are mineral and 0s are worthless scalene-like rock).
 * You must return the cross-sectional area of the largest harvestable mineral from the input rock, as follows:
 *
 * * The minerals only have smooth faces when sheared vertically or horizontally from the rock's cross-section
 * * The mine is only concerned with harvesting isosceles triangles (such that one or two sides can be sheared)
 * * If only one face of the mineral is sheared, its opposing vertex must be a point
 *   (ie. the smooth face must be of odd length), and its two equal-length sides must intersect the shear face at 45°
 *   (ie. those sides must cut even-diagonally)
 * * The harvested mineral may not contain any traces of rock
 * * The mineral may lie in any orientation in the plane
 * * Area should be calculated as the sum of 1s that comprise the mineral
 * * Minerals must have a minimum of three measures of area to be harvested
 * * If no minerals can be harvested from the rock, your function should return nil
 */
class LoveTriangleTest {
    @Test fun f1() {
        /*
        1111      1111
        1111      *111
        1111  ->  **11
        1111      ***1
        1111      ****
        */
        assertEquals(10, loveTriangle(15, 15, 15, 15, 15))
    }

    @Test fun f2() {
        /*
        00001      0000*
        00011      000**
        00111  ->  00***
        01111      0****
        11111      *****
        */
        assertEquals(15, loveTriangle(1, 3, 7, 15, 31))
    }

    @Test fun f3() {
        /*
        11      *1
        11  ->  **
        */
        assertEquals(3, loveTriangle(3, 3))
    }

    @Test fun f4() {
        /*
        111      ***
        011  ->  0*1
        */
        assertEquals(4, loveTriangle(7, 3))
    }

    @Test fun f5() {
        /*
        10001      10001
        10110      101*0
        00110  ->  00**0
        01110      0***0
        10110      10110
        */
        assertEquals(6, loveTriangle(17, 22, 6, 14, 22))
    }

    @Test fun f6() {
        /*
        10010      10010
        00111      001*0
        01110      01**0
        01110  ->  0***0
        00110      00**0
        00011      000*1
        */
        assertEquals(9, loveTriangle(18, 7, 14, 14, 6, 3))
    }

    @Test fun f7() {
        /*
        10101      10101
        01010      01010
        10101  ->  10101
        01010      01010
        */
        assertNull(loveTriangle(21, 10, 21, 10))
    }

    @Test fun f8() {
        /*
        00000      00000
        11111      11111
        00000  ->  00000
        11111      11111
        00000      00000
        */
        assertNull(loveTriangle(0, 31, 0, 31, 0))
    }
}
