package iad1.hashtable;

public class MathijsHashTable<K, V> implements HashTable<K, V> {

    private HashEntry[] buckets;

    private int TABLE_SIZE = 100;

    public MathijsHashTable() {
        buckets = new HashEntry[TABLE_SIZE];
    }

    @Override
    public V get(K key) {
        final int hash = hash(key);

        HashEntry<K, V> bucket = buckets[hash];
        V something = null;

        if(null != bucket) {
            K otherKey = bucket.getKey();
            something = bucket.getValue();

            while (! key.equals(otherKey) && bucket != null) {
                otherKey = bucket.getKey();
                something = bucket.getValue();
                bucket = bucket.getNext();

                if(bucket == null) {
                    something = null;
                }
            }
        }
        return something;
    }

    @Override
    public V put(K key, V value) {
        final int hash = hash(key);
        final HashEntry<K, V> entry = new HashEntry(key, value);

        HashEntry<K, V> bucket = buckets[hash];

        if (null == bucket) {
            buckets[hash] = entry;
        } else {
            bucket.setNext(entry);
        }

        return value;
    }

    private int hash(K key) {
        final String hashCodeString = String.valueOf(Math.abs((long) key.hashCode()));
        int hash = hashCodeString.charAt(0);

        if(hash < 0 || hash > buckets.length - 1) {
            throw new RuntimeException(String.format("Hash code [%d] exceeds the bounds [%d] of the buckets array!", hash, buckets.length));
        }

        return hash;
    }

    private class HashEntry<K, V> {
        private K key;
        private V value;
        private HashEntry<K, V> next;

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

        public void setNext(HashEntry<K,V> next) {
            if(null == this.next) {
                this.next = next;
            } else {
                this.next.setNext(next);
            }
        }

        public HashEntry<K, V> getNext() {
            return next;
        }

        public boolean hasNext() {
            return null != next;
        }
    }
}
