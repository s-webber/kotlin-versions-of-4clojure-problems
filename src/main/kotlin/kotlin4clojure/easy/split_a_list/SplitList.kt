package kotlin4clojure.easy.split_a_list

fun <T> splitList(n: Int, input: List<T>) = Pair(input.take(n), input.drop(n))
