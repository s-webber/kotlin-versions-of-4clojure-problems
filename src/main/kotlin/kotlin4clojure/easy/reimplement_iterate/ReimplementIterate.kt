package kotlin4clojure.easy.reimplement_iterate

fun <T: Any> reimplementIterate(f: (T) -> T, start: T) = generateSequence(start, { f.invoke(it) })
