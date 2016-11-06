package kotlin4clojure.medium.write_roman_numerals

fun writeRomanNumerals(input: Int): String {
    val output = StringBuilder()
    writeRomanNumerals(input, output)
    return output.toString()
}

tailrec fun writeRomanNumerals(input: Int, output: StringBuilder) {
    if (input != 0) {
        val next = next(input)
        output.append(next.first)
        writeRomanNumerals(input - next.second, output)
    }
}

fun next(input: Int) = romanNumerals.first { it.second <= input }

val romanNumerals = listOf("M" to 1000,
                           "CM" to 900,
                           "D" to 500,
                           "CD" to 400,
                           "C" to 100,
                           "XC" to 90,
                           "L" to 50,
                           "XL" to 40,
                           "X" to 10,
                           "IX" to 9,
                           "V" to 5,
                           "IV" to 4,
                           "I" to 1)
