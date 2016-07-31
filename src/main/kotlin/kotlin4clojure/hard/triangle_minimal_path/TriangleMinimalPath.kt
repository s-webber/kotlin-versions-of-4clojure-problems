package kotlin4clojure.hard.triangle_minimal_path

fun triangleMinimalPath(input: List<List<Int>>, depth: Int = 0): Int {
    val value = input[0][depth]
    val children = input.drop(1)
    if (children.isEmpty()) {
        return value
    } else {
        return value + Math.min(triangleMinimalPath(children, depth), triangleMinimalPath(children, depth + 1))
    }
}
