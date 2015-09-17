package iad1.hashtable;

import java.util.Map;

public interface HashTable<K, V> {
    V get(K key);
    V put(K key, V value);
}
