package kotlin4clojure.util

import java.math.BigInteger

/**
 * Returns a [List] containing [BigInteger] representations of the specified [Int] elements.
 */
fun bigInts(vararg input: Int) = input.map { bigInt(it) }.toList()

/**
 * Translates the [String] representation of the specified [Any] into a [BigInteger].
 */
fun bigInt(n: Any) = BigInteger(n.toString())
