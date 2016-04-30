package kotlin4clojure.easy.group_a_list

fun <K, V> groupList(f: (V) -> K, input: List<V>) = input.groupBy(f)
