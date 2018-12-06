package lab6.task3;

public class Entry<K, V> {
    K key;
    V value;

    Entry(K k, V v){
        key = k;
        value = v;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key.toString() + ' ' + value.toString();
    }
}
