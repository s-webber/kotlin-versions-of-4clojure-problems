package kotlin4clojure.medium.the_big_divide

import java.math.BigInteger

private val TWO = BigInteger("2")

fun bigDivide(n: BigInteger, a: BigInteger, b: BigInteger): BigInteger {
    val max = n - BigInteger.ONE
    val c = a * b
    val sumA = f(max, a)
    val sumB = f(max, b)
    val sumC = f(max, c)
    return ((sumA + sumB) - sumC) / TWO
}

fun f(max: BigInteger, n: BigInteger) =
    (max / n) * ((max - max.mod(n)) + n)
