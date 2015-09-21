package iad1.hashtable;

public interface HashTable<K, V> {
    V get(K key);
    V put(K key, V value);
    V delete(K key);
}
