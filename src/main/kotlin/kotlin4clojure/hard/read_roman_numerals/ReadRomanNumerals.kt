package kotlin4clojure.hard.read_roman_numerals

fun readRomanNumerals(input: String) = tailRecReadRomanNumerals(input, 0)

private tailrec fun tailRecReadRomanNumerals(remaining: String, current: Int): Int =
    if (remaining.isEmpty()) {
        current
    } else {
        val next = next(remaining)
        val remainder = remaining.substring(0, remaining.length - next.first.length)
        tailRecReadRomanNumerals(remainder, current + next.second)
    }

fun next(input: String) = romanNumerals.first { input.endsWith(it.first) }

val romanNumerals = listOf("CM" to 900,
                           "CD" to 400,
                           "XC" to 90,
                           "XL" to 40,
                           "IX" to 9,
                           "IV" to 4,
                           "M" to 1000,
                           "D" to 500,
                           "C" to 100,
                           "L" to 50,
                           "X" to 10,
                           "V" to 5,
                           "I" to 1)
