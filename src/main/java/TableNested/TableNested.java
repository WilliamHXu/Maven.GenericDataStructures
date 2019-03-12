package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<Entry<K, V>> entries;

    public TableNested() {
        entries = new ArrayList<Entry<K, V>>();
    }

    public V get(K key){
        for (Entry<K, V> entry : entries){
            if (key.equals(entry.getKey())){
                return entry.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value){
        boolean flag = false;
        for(Entry<K, V> entry : entries){
            if(key.equals(entry.getKey())){
                entry.setValue(value);
                flag = true;
                break;
            }
        }
        // If no update, then insert new entry
        if (!flag) {
            Entry<K, V> entry = new Entry<K, V>(key, value);
            entries.add(entry);
        }
    }

    public void remove(K key){
        for(Entry<K, V> entry : entries){
            if(key.equals(entry.getKey())){
                entries.remove(entry);
                break;
            }
        }
    }


    // Nested Entry Class

    public class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

}


