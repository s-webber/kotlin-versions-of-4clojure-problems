package kotlin4clojure.medium.parentheses_again

fun parenthesesAgain(size: Int) = recursiveSolve(size, mapOf(0 to setOf("")))

tailrec fun recursiveSolve(target: Int, cache: Map<Int, Set<String>>): Set<String>  {
    val current = cache.size
    if (target < current) {
        return cache[target]!!
    } else {
        val updatedCache = cache + Pair(current, calculateNextPermutations(cache))
        return recursiveSolve(target, updatedCache)
    }
}

fun calculateNextPermutations(cache: Map<Int, Set<String>>): Set<String> {
    val current = cache.size
    val m = cache[current - 1]!!.map { "($it)" }.toSet()
    return (1..current - 1).fold(m, { initial, operation ->
        initial + combine(cache[operation]!!, cache[current - operation]!!)
    })
}

fun combine(a: Set<String>, b: Set<String>) =
    a.map {
        val left = it
        b.map { left + it }
    }.flatten().toSet()

