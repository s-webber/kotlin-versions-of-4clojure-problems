package kotlin4clojure.util

operator fun Pair<Int, Int>.plus(p: Pair<Int, Int>) = this.first + p.first to this.second + p.second
