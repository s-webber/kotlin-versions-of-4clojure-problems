package kotlin4clojure.hard.levenshtein_distance

// based on Java and Kotlin examples from:
// https://en.wikibooks.org/wiki/Algorithm_Implementation/Strings/Levenshtein_distance
fun <T> levenshteinDistance(lhs: List<T>, rhs: List<T>): Int {
    var cost = IntArray(lhs.size + 1) { it }
    var newCost = IntArray(lhs.size + 1)

    for (j in 1..rhs.size) {
        newCost[0] = j

        for (i in 1..lhs.size) {
            // matching current letters in both strings
            val match = if (lhs[i - 1] == rhs[j - 1]) 0 else 1

            // computing cost for each transformation
            val costReplace = cost[i - 1] + match
            val costInsert = cost[i] + 1
            val costDelete = newCost[i - 1] + 1

            // keep minimum cost
            newCost[i] = min(costInsert, costDelete, costReplace)
        }

        // swap cost/newcost arrays
        val swap = cost
        cost = newCost
        newCost = swap
    }

    // the distance is the cost for transforming all letters in both strings
    return cost[lhs.size]
}

inline fun min(a: Int, b: Int, c: Int) = Math.min(Math.min(a, b), c)
