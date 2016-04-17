package kotlin4clojure.easy.beauty_is_symmetry

fun <T> beautyIsSymmetry(input: Node<T>): Boolean {
    TODO("Add your solution here")
}

data class Node<T> (val id: T, val left: Node<T>? = null, val right: Node<T>? = null)
