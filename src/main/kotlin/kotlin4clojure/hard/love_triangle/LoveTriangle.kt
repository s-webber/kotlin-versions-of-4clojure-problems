package kotlin4clojure.hard.love_triangle

val ROCK = '0'

val DIRECTIONS = listOf(listOf( 1 to  0,  0 to  1),
                        listOf(-1 to  0,  0 to  1),
                        listOf( 1 to  0,  0 to -1),
                        listOf(-1 to  0,  0 to -1),
                        listOf( 1 to -1,  1 to  0,  1 to  1),
                        listOf(-1 to -1, -1 to  0, -1 to  1),
                        listOf(-1 to  1,  0 to  1, -1 to  1),
                        listOf(-1 to -1,  0 to -1,  1 to -1))

fun loveTriangle(vararg input: Int): Int? {
    val mineralSet = toMineralSet(input)
    return mineralSet.flatMap { coord ->
        DIRECTIONS.map {
            getMaxShape(mineralSet, it, setOf(coord), 1)
        }
    }.filter { it > 1 }.max()
}

fun toMineralSet(input: IntArray) : Set<Pair<Int, Int>> {
    val binaryString = input.map(Integer::toBinaryString);
    val maxLength = binaryString.maxBy(String::length)?.length ?: 0;
    val paddedBinaryString = binaryString.map { it.padStart(maxLength, ROCK) }
    return paddedBinaryString.mapIndexed { y, row ->
        row.mapIndexedNotNull { x, c ->
            if (c != ROCK) x to y else null
        }
    }.flatten().toSet()
}

tailrec fun getMaxShape(mineralSet: Set<Pair<Int, Int>>, direction: List<Pair<Int, Int>>, currentLayer: Set<Pair<Int, Int>>, currentSize: Int): Int {
    val nextLayer = currentLayer.flatMap { coord ->
        direction.map { coord.first + it.first to coord.second + it.second }
    }.toSet()
    if (!mineralSet.containsAll(nextLayer)) {
        return currentSize
    } else {
        return getMaxShape(mineralSet, direction, nextLayer, currentSize + nextLayer.size)
    }
}
