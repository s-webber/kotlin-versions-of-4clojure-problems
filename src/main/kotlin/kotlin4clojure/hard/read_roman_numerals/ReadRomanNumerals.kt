package kotlin4clojure.hard.read_roman_numerals

tailrec fun readRomanNumerals(input: String): Int {
    if (input.isEmpty()) {
        return 0
    } else {
        val next = next(input)
        val remainder = input.substring(0, input.length - next.first.length)
        return next.second + readRomanNumerals(remainder)
    }
}

fun next(input: String): Pair<String, Int> {
    return romanNumerals.first { input.endsWith(it.first) }
}

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
