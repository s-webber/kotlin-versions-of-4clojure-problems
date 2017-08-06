package kotlin4clojure.hard.squares_squared

import java.math.BigInteger
import kotlin.coroutines.experimental.*;

fun squaresSquared(start: Int, end: Int): List<String> {
    val digits = generateSequence(BigInteger(start.toString()), { it * it })
                    .takeWhile { it <= BigInteger(end.toString()) }
                    .flatMap { it.toString().asSequence() }.toList()
    val maxDigitsPerLine = Math.ceil(Math.sqrt(digits.size.toDouble())).toInt()
    val gridHeight = (maxDigitsPerLine * 2) - 1
    val diamondSize = maxDigitsPerLine * maxDigitsPerLine
    val coords = diamondCoords.take(diamondSize).toList()
    val minX = coords.minBy { c -> c.first }!!.first
    val minY = coords.minBy { c -> c.second }!!.second
    val digitsByCoord = coords.mapIndexed({ i, (x, y) -> Pair(x - minX, y - minY) to digits.getOrElse(i, { _ -> '*' }) }).toMap()
    return (0..gridHeight-1).map {
        rowIdx -> (0..gridHeight-1).map {
            colIdx -> digitsByCoord.getOrElse(colIdx to rowIdx, { ' ' })
        }.joinToString("")
    }
}

val diamondCoords = buildSequence {
    var minX = 0
    var maxX = 0
    var minY = 0
    var maxY = 0
    var incX = 1
    var incY = 1
    var x = 0
    var y = 0

    while (true) {
        yield(x to y)

        x += incX
        y += incY
        if (x > maxX && y == 1) {
            incX= -1
            incY= 1
        } else if (x == 0 && y > maxY) {
            incX = -1
            incY = -1
        } else if (x == 0 && y < minY) {
            incX = 1
            incY = 1
        } else if (y == 0 && x < minX) {
            incX = 1
            incY = -1
        }

        maxX = Math.max(maxX, x)
        minX = Math.min(minX, x)
        maxY = Math.max(maxY, y)
        minY = Math.min(minY, y)
    }
}
