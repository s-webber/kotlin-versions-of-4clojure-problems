package kotlin4clojure.hard.tree_reparenting

fun treeReparenting(id: String, tree: Node) = find(id, tree, emptyList())

private fun find(target: String, next: Node, parents: List<Node>): Node? {
    if (target.equals(next.id)) {
        if (parents.isEmpty()) {
            return next
        } else {
            return Node(next.id, next.children + restructure(parents.last(), next, parents.dropLast(1)))
        }
    } else {
        val updatedParents = parents + next
        next.children.forEach {
            val n = find(target, it, updatedParents)
            if (n!=null) {
                return n
            }
        }
        return null
    }
}

private fun restructure(n: Node, newParent: Node, oldParents: List<Node>): Node {
    val childrenMinusNewParent = n.children.filterNot { newParent == it }
    if (oldParents.isEmpty()) {
        return Node(n.id, childrenMinusNewParent)
    } else {
        return Node(n.id, childrenMinusNewParent + restructure(oldParents.first(), n, oldParents.drop(1)))
    }
}

fun treeOf(id: String, vararg children: Node) = Node(id, children.asList())

data class Node (val id: String, val children: List<Node> = emptyList())
