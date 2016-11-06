package kotlin4clojure.medium.oscilrate

fun <T: Any> oscilrate(initialValue: T, vararg functions: (T) -> T): Sequence<T> {
    var i = 0

    return generateSequence(initialValue, { previous ->
        val f = functions[i++]
        if (i == functions.size) {
            i = 0
        }
        f.invoke(previous)
    })
}
