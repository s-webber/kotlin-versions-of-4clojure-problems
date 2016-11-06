package kotlin4clojure.medium.digits_and_bases

fun digits(input: Int, base: Int) =
    if (input == 0) {
        listOf(0)
    } else {
        var n = input
        generateSequence({
            if (n > 0) {
                val result = n % base
                n /= base
                result
            } else {
                null
            }
        }).toList().asReversed()
    }

