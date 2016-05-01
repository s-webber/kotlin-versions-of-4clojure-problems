package kotlin4clojure.medium.perfect_numbers

fun perfectNumber(input: Int): Boolean {
    var n = 2
    var result = 1
    while (n < input) {
        if (input % n == 0) {
            result += n
        }
        n++
    }
    return input == result
}
