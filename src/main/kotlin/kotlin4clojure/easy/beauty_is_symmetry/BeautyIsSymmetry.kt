package kotlin4clojure.easy.beauty_is_symmetry

fun <T> beautyIsSymmetry(n: Node<T>) = n.left == reverseTree(n.right)

fun <T> reverseTree(n: Node<T>?): Node<T>? {
    if (n == null) {
        return null
    } else {
        return Node(n.id, reverseTree(n.right), reverseTree(n.left))
    }
}

data class Node<T> (val id: T, val left: Node<T>? = null, val right: Node<T>? = null)
