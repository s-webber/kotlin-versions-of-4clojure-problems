package kotlin4clojure.hard.tree_reparenting

fun treeReparenting(id: String, tree: Node): Node {
    TODO("Add your solution here")
}

fun treeOf(id: String, vararg children: Node) = Node(id, children.asList())

data class Node (val id: String, val children: List<Node>? = null)
