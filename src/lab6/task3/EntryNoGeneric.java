package lab6.task3;

public class EntryNoGeneric {
    Object key;
    Object value;

    EntryNoGeneric(Object k, Object v){
        key = k;
        value = v;
    }

    Object getKey() {
        return key;
    }

    Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key.toString() + ' ' + value.toString();
    }
}
