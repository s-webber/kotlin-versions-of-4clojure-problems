package kotlin4clojure.easy.pascals_trapezoid

import java.math.BigInteger

fun pascalsTrapezoid(input: List<BigInteger>) =
    generateSequence(input, {previous ->
        (0..previous.size).map {
            when (it) {
                0 -> previous.first()
                previous.size -> previous.last()
                else -> previous[it] + previous[it - 1]
            }
        }.toList()
    })
