package HashMapsAndHash.CustomHashMap;

import java.util.LinkedList;

class BasicHashMap<K,V> {
    private static final int SIZE = 10; // Fixed size of the hash table
    private LinkedList<Entry<K, V>>[] table;
    public BasicHashMap() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Method to compute hash index
    private int getIndex(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    // Method to insert a key-value pair
    public void put(K key, V value) {
        int index = getIndex(key);
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update existing key
                return;
            }
        }
        table[index].add(new Entry<>(key, value));
    }

    // Method to retrieve a value by key
    public V get(K key) {
        int index = getIndex(key);
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null; // Key not found
    }

    // Method to remove a key-value pair
    public void remove(K key) {
        int index = getIndex(key);
        table[index].removeIf(entry -> entry.key.equals(key));
    }

}
