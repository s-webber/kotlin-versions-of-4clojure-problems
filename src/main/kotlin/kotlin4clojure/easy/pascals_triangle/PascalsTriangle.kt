package kotlin4clojure.easy.pascals_triangle

import kotlin4clojure.easy.pascals_trapezoid.pascalsTrapezoid
import java.math.BigInteger

fun pascalsTriangle(input: Int) =
    pascalsTrapezoid(listOf(BigInteger.ONE)).drop(input - 1).first()
