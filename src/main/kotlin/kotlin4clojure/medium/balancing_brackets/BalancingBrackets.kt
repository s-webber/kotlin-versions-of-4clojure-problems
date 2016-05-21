package kotlin4clojure.medium.balancing_brackets

fun balance(input: String): Boolean {
    val elements = extractBrackets(input)
    return isBalanced(elements)
}

fun extractBrackets(input: String) = input.filter { brackets.contains(it) }.toList()

private tailrec fun isBalanced(elements: List<Char>, stack: java.util.Stack<Char> = java.util.Stack()): Boolean {
    if (elements.isEmpty()) {
        return stack.isEmpty()
    } else {
        val next = elements.first()
        if (openingBrackets.containsKey(next)) {
            stack.push(next)
        } else if (stack.isEmpty()) {
            return false
        } else if (closingBrackets[next] != stack.peek()) {
            return false
        } else {
            stack.pop()
        }
        return isBalanced(elements.drop(1), stack)
    }
}

val openingBrackets = mapOf('[' to ']', '(' to ')', '{' to '}')

val closingBrackets = openingBrackets.map { it.value to it.key }.toMap()

val brackets = openingBrackets.keys + closingBrackets.keys
