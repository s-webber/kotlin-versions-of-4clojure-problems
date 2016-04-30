package kotlin4clojure.easy.greatest_common_divisor

tailrec fun greatestCommonDivisor(a: Int, b: Int): Int {
    if (b == 0) {
        return a
    } else {
        return greatestCommonDivisor(b, a % b)
    }
}
