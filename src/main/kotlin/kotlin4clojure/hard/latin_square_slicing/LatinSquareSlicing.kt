package kotlin4clojure.hard.latin_square_slicing

fun <T> latinSquareSlicing(input: List<List<T?>>): Set<Pair<Int, Int>> {
    val subSquarePositions = getSubSquarePositions(input)

    val possibleAlignmentsOfRows = getRowAlignments(input)

    // fir each permutation get sub squares and filter by latin
    val result = possibleAlignmentsOfRows.permutations().flatMap { permutation ->
        subSquarePositions.flatMap { (subSquareSize, startCoords) ->
            startCoords.map { subSquare(permutation, it, subSquareSize) }
        }
    }.toSet().filterNotNull().filter {
        isLatin(it)
    }

    return result.groupBy { it.size }.map { it.key to it.value.size }.toSet()
}

/** See `testGetSubSquarePositions` of `LatinSquareSlicingTest` for a demonstration of this function. */
fun <T> getSubSquarePositions(input: List<List<T?>>): Map<Int, List<Pair<Int, Int>>> {
    val gridWidth = input.maxBy { it.size }!!.size
    val gridHeight = input.size
    val minSquareSize = 2
    val maxSquareSize = if (gridWidth < gridHeight) gridWidth else gridHeight
    return (minSquareSize..maxSquareSize).map { width ->
        width to (0..gridWidth - width).flatMap { x ->
            (0..gridHeight - width).map { y ->
                x to y
            }.toList()
        }.toList()
    }.toMap()
}

/** See `testRowAlignmentsAndPermutations` of `LatinSquareSlicingTest` for a demonstration of this function. */
fun <T> getRowAlignments(input: List<List<T?>>): List<List<List<T?>>> {
    val maxRowSize = input.map { it.size }.max()!!
    val nulls = (1..maxRowSize).map { null }.toList()
    return input.map { row ->
        val requiredPadding = maxRowSize - row.size
        (0..requiredPadding).map {
            nulls.take(it) + row + nulls.take(requiredPadding - it)
        }.toList()
    }.toList()
}

/** See `testRowAlignmentsAndPermutations` of `LatinSquareSlicingTest` for a demonstration of this extension function. */
fun <T> List<List<List<T?>>>.permutations(): List<List<List<T?>>> =
        if (this.size == 1) {
            this[0].map {
                listOf(it)
            }
        } else {
            val childPermutations: List<List<List<T?>>> = this.drop(1).permutations()
            this.first().flatMap { f:List<T?>  ->
                childPermutations.map { p: List<List<T?>> ->
                    val result:MutableList<List<T?>> = mutableListOf()
                    result.add(f)
                    result.addAll(p)
                    result.toList()
                }
            }
        }

/** See `testSubSquare` of `LatinSquareSlicingTest` for a demonstration of this function. */
fun <T> subSquare(input: List<List<T?>>, start: Pair<Int, Int>, subSquareSize: Int): List<List<T?>>? =  0.until(subSquareSize).map {
    val result = input[start.second+it].subList(start.first, start.first+subSquareSize)
    if (result.contains(null)) return null else result
}

/** See `testIsLatin` of `LatinSquareSlicingTest` for a demonstration of this function. */
fun <T> isLatin(input: List<List<T?>>): Boolean {
    val first = input[0].distinct()

    if (first.size!=input.size) {
        return false
    }

    1.until(input.size).forEach {
        if (!input[it].containsAll(first)) {
            return false
        }
    }

    0.until(input.size).map { x ->
        0.until(input.size).map { y ->
            input[y][x]
        }
    }.forEach {
        if (!it.containsAll(first)) {
            return false
        }
    }

    return true
}
