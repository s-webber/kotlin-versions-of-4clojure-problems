# Kotlin versions of 4Clojure problems

## Overview

This project provides unit tests to support the solving of [4Clojure](https://www.4clojure.com/) problems using the [Kotlin](https://kotlinlang.org/) programming language.

## Structure

The `src/test/kotlin` directory contains the unit tests.

The `src/main/kotlin` directory contains the functions that the unit tests call.

You can run the unit tests from the command line by using the following command:

```
gradlew test
```

You will then be able to view the resulting test report at:

```
build/reports/tests/index.html
```

You will see a large number of test failures.
This is to be expected.
The functions in `src/main/kotlin`, that are called by the unit tests, contain nothing but a call to [`TODO`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-t-o-d-o.html), which always throws `NotImplementedError` to indicate that the operation is not implemented. e.g.:

```
fun <T> symmetricDifference(a: Set<T>, b: Set<T>): Set<T> {
   TODO("Add your solution here")
}
```

## Example

The following links demonstrate the relationship between a problem on the 4Clojure website, the corresponding Kotlin unit tests in the `kotlin-versions-of-4clojure-problems` repository, the failing function on the `master` branch and a working solution on the `solutions` branch:

- The 4Clojure website contains a [description of the "Count Occurrences" problem](https://www.4clojure.com/problem/55).
- The `kotlin-versions-of-4clojure-problems` repository contains [Kotlin unit tests for the problem](https://github.com/s-webber/kotlin-versions-of-4clojure-problems/blob/master/src/test/kotlin/kotlin4clojure/medium/count_occurrences/CountOccurrencesTest.kt).
- The `master` branch contains a [function which causes the unit tests to fail](https://github.com/s-webber/kotlin-versions-of-4clojure-problems/blob/master/src/main/kotlin/kotlin4clojure/medium/count_occurrences/CountOccurrences.kt).
- The `solutions` branch contains a [working solution to the problem which cause the unit tests to succeed](https://github.com/s-webber/kotlin-versions-of-4clojure-problems/blob/solutions/src/main/kotlin/kotlin4clojure/medium/count_occurrences/CountOccurrences.kt).
