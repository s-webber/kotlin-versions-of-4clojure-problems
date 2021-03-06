# Kotlin versions of 4Clojure problems

## Overview

This project provides unit tests to support the solving of [4Clojure](https://www.4clojure.com/) problems using the [Kotlin](https://kotlinlang.org/) programming language.

## Directory structure

The `src/test/kotlin` directory contains the unit tests.

The `src/main/kotlin` directory contains the functions that the unit tests call.

## Running the tests

You can run the unit tests from the command line by using the following command:

```
gradlew test
```

You will then be able to view the resulting test report at:

```
build/reports/tests/index.html
```

## Usage

When you first run the unit tests you will see a large number of failures.
This is to be expected.
The functions in `src/main/kotlin`, that are called by the unit tests, contain nothing but a call to [`TODO`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-t-o-d-o.html) - which always throws `NotImplementedError` to indicate that the operation is not implemented. e.g.:

```
fun <T> symmetricDifference(a: Set<T>, b: Set<T>): Set<T> {
   TODO("Add your solution here")
}
```

To get the unit tests to succeed you will need to replace the calls to `TODO` with actual solutions to the problems.
You may wish to first fork the repository to allow you to keep a record of your progress.

If you are seeking inspiration for how to solve the problems then you can checkout the [`solutions`](https://github.com/s-webber/kotlin-versions-of-4clojure-problems/tree/solutions) branch to view example solutions.

## Example

The following links demonstrate the relationship between a problem on the 4Clojure website, the corresponding Kotlin unit tests in the `kotlin-versions-of-4clojure-problems` repository, the failing function on the `master` branch and a working solution on the `solutions` branch:

- The 4Clojure website contains a [description of the "Count Occurrences" problem](https://www.4clojure.com/problem/55).
- The `kotlin-versions-of-4clojure-problems` repository contains [Kotlin unit tests for the problem](https://github.com/s-webber/kotlin-versions-of-4clojure-problems/blob/master/src/test/kotlin/kotlin4clojure/medium/count_occurrences/CountOccurrencesTest.kt).
- The `master` branch contains a [function which causes the unit tests to fail](https://github.com/s-webber/kotlin-versions-of-4clojure-problems/blob/master/src/main/kotlin/kotlin4clojure/medium/count_occurrences/CountOccurrences.kt).
- The `solutions` branch contains a [working solution to the problem, which causes the unit tests to succeed](https://github.com/s-webber/kotlin-versions-of-4clojure-problems/blob/solutions/src/main/kotlin/kotlin4clojure/medium/count_occurrences/CountOccurrences.kt).

## Notes

Differences between 4Clojure and `kotlin-versions-of-4clojure-problems` include:

- Some 4Clojure problems (particularly the elementary problems) are concerned with specific Clojure functions (e.g. ["Let it Be"](https://www.4clojure.com/problem/36)) and so have not been ported to `kotlin-versions-of-4clojure-problems`.
- Some 4Clojure problems have special restrictions regarding which functions can be used to solve them (e.g. ["Count a Sequence"](https://www.4clojure.com/problem/22)) - `kotlin-versions-of-4clojure-problems` does not impose similar restrictions.
- The 4Clojure website enforces time limits on how long tests can take to run - `kotlin-versions-of-4clojure-problems` does not enforce any time limits.
