package kotlin4clojure.medium.word_sorting

fun wordSorting(input: String) =
    input.filter { it.isLetter() || it == ' ' }
         .split(' ')
         .sortedBy { it.toLowerCase() }
         .toList()
