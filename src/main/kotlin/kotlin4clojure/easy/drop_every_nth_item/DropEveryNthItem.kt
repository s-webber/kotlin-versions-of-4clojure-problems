package kotlin4clojure.easy.drop_every_nth_item

fun <T> dropEveryNth(input: List<T>, n: Int) = input.filterIndexed { i, _ ->  (i+1) % n != 0 }
