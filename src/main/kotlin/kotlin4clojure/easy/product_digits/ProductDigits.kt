package kotlin4clojure.easy.product_digits

fun productDigits(a: Int, b: Int): List<Int> {
    var number = a * b

    return generateSequence{
        if (number > 0) {
            val result = number % 10
            number /= 10
            result
        } else {
            null
        }
    }.toList().asReversed()
}
