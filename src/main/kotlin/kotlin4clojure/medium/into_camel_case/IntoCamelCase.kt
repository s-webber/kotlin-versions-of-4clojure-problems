package kotlin4clojure.medium.into_camel_case

fun intoCamelCase(input: String): String {
    val sb = StringBuilder()
    var toUpper = false
    for (c in input) {
        if (c == '-') {
            toUpper = true
        } else  {
            sb.append(if (toUpper) c.toUpperCase() else c)
            toUpper = false
        }
    }
    return sb.toString()
}
