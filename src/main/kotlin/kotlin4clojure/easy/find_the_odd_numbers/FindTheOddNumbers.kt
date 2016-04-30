package kotlin4clojure.easy.find_the_odd_numbers

fun findOddNumbers(input: Collection<Int>) = input.filter { it % 2 == 1 }
