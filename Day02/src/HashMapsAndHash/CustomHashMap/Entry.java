package HashMapsAndHash.CustomHashMap;

class Entry<K,V> {
     K key;
     V value;
     Entry<K, V> next;  // Reference to next entry (for handling collisions)

     Entry(K key, V value) {
         this.key = key;
         this.value = value;
     }
}
