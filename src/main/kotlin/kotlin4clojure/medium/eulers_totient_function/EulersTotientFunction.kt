package kotlin4clojure.medium.eulers_totient_function

import kotlin4clojure.easy.greatest_common_divisor.greatestCommonDivisor

fun eulerTotient(input: Int) =
    (0..input - 1).count { greatestCommonDivisor(it, input) == 1 }
