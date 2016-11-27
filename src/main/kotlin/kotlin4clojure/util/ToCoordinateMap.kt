package kotlin4clojure.util

fun List<String>.toCoordinateMap() : Map<Pair<Int, Int>, Char> =
    this.mapIndexed { y, row ->
        row.mapIndexed { x, c ->
            Pair(x to y, c)
        }
    }.flatten().toMap()
