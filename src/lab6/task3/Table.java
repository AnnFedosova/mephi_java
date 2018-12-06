package lab6.task3;

import java.util.ArrayList;

class Table<K, V> {
    ArrayList<Entry<K, V>> arrayList;

    Table(){
        arrayList = new ArrayList<>();
    };

    boolean add(Entry<K, V> entry){
        if (isExists(entry.key)){
            return false;
        }
        return arrayList.add(entry);
    }

    boolean removeByKey(K k){
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i).getKey() == k){
                arrayList.remove(i);
                return true;
            }
        }
        return false;
    }

    boolean set(K k, V v){
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getKey() == k) {
                arrayList.set(i, new Entry<K, V>(k, v));
                return true;
            }
        }
        return false;
    }

    V getValueByKey(K k){
        for (Entry<K, V> entry : arrayList) {
            if (entry.getKey() == k) {
                return entry.getValue();
            }

        }
        return null;
    }

    boolean isExists(K k){
        for (Entry entry : arrayList) {
            if (entry.getKey() == k) {
                return true;
            }
        }
        return false;
    }

    void showTable(){
        System.out.println("Table:");
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(i + " " + arrayList.get(i));
        }
    }

}
