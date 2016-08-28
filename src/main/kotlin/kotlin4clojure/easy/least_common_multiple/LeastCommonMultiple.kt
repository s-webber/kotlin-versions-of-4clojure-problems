package kotlin4clojure.easy.least_common_multiple

import kotlin4clojure.easy.greatest_common_divisor.greatestCommonDivisor

fun leastCommonMultiple(vararg input: Ratio) =
    input.reduce { a, b -> lcm(a, b) }

fun lcm(a: Ratio, b: Ratio): Ratio {
    val denominatorLcm = lcm(a.denominator, b.denominator)
    val numeratorLcm = lcm(a.scale(denominatorLcm).numerator, b.scale(denominatorLcm).numerator)
    val lcm = Ratio(numeratorLcm, denominatorLcm)
    val gcd = greatestCommonDivisor(lcm.numerator, lcm.denominator)
    return lcm / gcd
}

fun lcm(a: Int, b:Int): Int =
    (a * b) / greatestCommonDivisor(a, b)

operator fun Ratio.div(gcd: Int) =
    Ratio(this.numerator / gcd, this.denominator / gcd)

fun Ratio.scale(n: Int) =
    Ratio(this.numerator * (n / this.denominator), this.denominator)

data class Ratio(val numerator: Int, val denominator: Int = 1)
