package kotlin4clojure.easy.palindrome_detector

fun palindromeDetector(vararg input: Any): Boolean {
    val maxIdx = input.size - 1
    val middle = input.size / 2
    for (i in 0..middle) {
        if (input[i] != input[maxIdx - i]) {
            return false;
        }
    }
    return true;
}
