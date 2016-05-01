package kotlin4clojure.easy.fibonacci_sequence

fun fibonacciSequence(n: Int): List<Long> {
    return return fibonacciSequence().take(n).toList()
}

fun fibonacciSequence() : Sequence<Long> {
    var a = 0L
    var b = 1L

    fun next() : Long {
        val result = a + b
        a = b
        b = result
        return a
    }

    return generateSequence(::next)
}
