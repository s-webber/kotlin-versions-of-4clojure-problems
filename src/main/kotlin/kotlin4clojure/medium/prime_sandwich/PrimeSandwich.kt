package kotlin4clojure.medium.prime_sandwich

import java.math.BigInteger

val TWO = BigInteger("2")
val THREE = BigInteger("3")
val CERTAINTY = 5

fun primeSandwich(input: Int): Boolean {
    val target = BigInteger(input.toString())
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
