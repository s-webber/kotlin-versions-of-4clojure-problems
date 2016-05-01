package kotlin4clojure.medium.word_sorting

fun wordSorting(input: String): List<String> {
    return input.filter { it.isLetter() || it == ' ' }
                .split(' ')
                .sortedBy { it.toLowerCase() }
                .toList()
}
