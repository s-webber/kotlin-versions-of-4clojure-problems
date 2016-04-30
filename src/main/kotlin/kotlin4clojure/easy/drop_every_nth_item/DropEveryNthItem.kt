package kotlin4clojure.easy.drop_every_nth_item

fun <T> dropEveryNth(input: List<T>, n: Int): List<T> {
    return input.filterIndexed { i, t ->  (i+1) % n != 0 }
}
