package kotlin4clojure.medium.prime_sandwich

import kotlin4clojure.util.bigInt
import java.math.BigInteger

val TWO = BigInteger("2")
val THREE = BigInteger("3")
val CERTAINTY = 5

fun primeSandwich(input: Int): Boolean {
    val target = bigInt(input)
    if (target.isProbablePrime(CERTAINTY)) {
        return primeSandwich(target, THREE)
    } else {
        return false
    }
}

private tailrec fun primeSandwich(target: BigInteger, previous: BigInteger): Boolean {
    val current = previous.nextProbablePrime()
    return when {
        current == target -> current == (previous + current.nextProbablePrime()) / TWO
        current > target -> false
        else -> primeSandwich(target, current)
    }
}
