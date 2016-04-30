package kotlin4clojure.easy.halftruth

fun halfTruth(vararg input: Boolean): Boolean {
    var someTrue = false;
    var someFalse = false;
    input.forEach { if (it) someTrue = true else someFalse = true }
    return someTrue && someFalse
}
