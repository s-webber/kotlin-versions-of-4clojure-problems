package kotlin4clojure.medium.digits_and_bases

fun digits(input: Int, base: Int): List<Int> {
    if (input == 0) {
        return listOf(0)
    } else {
        var n = input
        return generateSequence({
            if (n > 0) {
                val result = n % base
                n = n / base
                result
            } else {
                null
            }
        }).toList().asReversed()
    }
}
