package kotlin4clojure.medium.anagram_finder

fun anagrams(vararg keys:String): Set<Set<String>> {
    return keys.groupBy { it.toSortedSet() }
               .values
               .filter { it.size > 1 }
               .map { it.toSet() }
               .toSet()
}
