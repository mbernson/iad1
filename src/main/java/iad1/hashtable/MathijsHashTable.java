package iad1.hashtable;

public class MathijsHashTable<K, V> implements HashTable<K, V> {

    private HashEntry<K, V>[] buckets;

    private int TABLE_SIZE = 100;

    public MathijsHashTable() {
        buckets = new HashEntry[TABLE_SIZE];
    }

    private HashEntry<K, V> findEntry(K key) {
        final int hash = hash(key);

        HashEntry<K, V> bucket = buckets[hash];

        if(null != bucket) {
            K otherKey = bucket.getKey();

            while (! key.equals(otherKey) && bucket != null) {
                otherKey = bucket.getKey();
                bucket = bucket.getNext();
            }
        }
        return bucket;
    }

    @Override
    public V get(K key) {
        final HashEntry<K, V> entry = findEntry(key);
        if(null == entry) {
            return null;
        } else {
            return entry.getValue();
        }
    }

    @Override
    public V put(K key, V value) {
        final int hash = hash(key);
        final HashEntry<K, V> entry = new HashEntry<>(key, value);

        HashEntry<K, V> bucket = buckets[hash];

        if (null == bucket) {
            buckets[hash] = entry;
        } else {
            bucket.append(entry);
        }

        return value;
    }

    @Override
    public V delete(K key) {
        final HashEntry<K, V> entry = findEntry(key);

        V ret = null;

        if(null != entry) {
            ret = entry.getValue();
            if(entry.getPrevious() != null) {
                entry.getPrevious().setNext(entry.getNext());
            }
            if(entry.getNext() != null) {
                entry.getNext().setPrevious(entry.getPrevious());
            }
            entry.clear();
        }

        return ret;
    }

    private int hash(K key) {
        int hashCode = Math.abs(key.hashCode());
        int hash = Integer.parseInt((""+hashCode).substring(0, 2));

        if(hash < 0) {
            throw new RuntimeException(String.format(
                    "Hash code [%d] exceeds the bounds [%d] of the buckets array!", hash, buckets.length));
        }
        while(hash > buckets.length - 1) {
            rehash();
        }

        return hash;
    }

    private void rehash() {
        increaseBuckets(2);
    }

    private void increaseBuckets(int factor) {
        TABLE_SIZE = factor;
        HashEntry<K, V>[] oldTable = buckets;
        buckets = new HashEntry[TABLE_SIZE];
        System.arraycopy(oldTable, 0, buckets, 0, oldTable.length);
    }

    private class HashEntry<K, V> {
        private final K key;
        private final V value;
        private HashEntry<K, V> next, previous;

        HashEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void append(HashEntry<K,V> next) {
            if(null == this.next) {
                this.next = next;
            } else {
                this.next.setNext(next);
            }
        }

        public void setNext(HashEntry<K, V> next) {
            this.next = next;
        }

        public HashEntry<K, V> getNext() {
            return next;
        }

        public HashEntry<K, V> getPrevious() {
            return previous;
        }

        public void setPrevious(HashEntry<K, V> previous) {
            this.previous = previous;
        }

        public void clear() {
            this.next = null;
            this.previous = null;
        }
    }
}
