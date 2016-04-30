package kotlin4clojure.elementary.nil_key

fun <K, V> nilKey(key: K, map: Map<K, V>) = map.containsKey(key) && map[key] == null
