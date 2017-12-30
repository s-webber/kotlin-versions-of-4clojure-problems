package kotlin4clojure.medium.rotate_list

fun <T> rotateList(n: Int, input: List<T>): List<T> {
    val step = n % input.size
    return input.mapIndexed { i, _ ->
        var idx = i + step
        if (idx < 0) {
            idx += input.size
        } else if (idx >= input.size) {
            idx -= input.size
        }
        input[idx]
    }.toList()
}
