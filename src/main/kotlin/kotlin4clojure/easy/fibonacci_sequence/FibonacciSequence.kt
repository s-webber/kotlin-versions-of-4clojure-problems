package kotlin4clojure.easy.fibonacci_sequence

fun fibonacciSequence(n: Int) = fibonacciSequence().take(n).toList()

fun fibonacciSequence() : Sequence<Long> {
    var a = 0L
    var b = 1L

    return generateSequence {
        val result = a + b
        a = b
        b = result
        a
    }
}
