package kotlin4clojure.medium.anagram_finder

fun anagrams(vararg keys:String): Set<Set<String>> {
    return keys.groupBy { it.toSortedSet() }
               .filter { it.value.size > 1 }
               .mapValues { it.value.toSet() }
               .values
               .toSet()
}
