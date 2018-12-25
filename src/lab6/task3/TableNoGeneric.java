package lab6.task3;

import javax.management.ObjectName;
import java.util.ArrayList;

public class TableNoGeneric {
    ArrayList<EntryNoGeneric> arrayList;

    TableNoGeneric(){
        arrayList = new ArrayList<>();
    };

    boolean add(EntryNoGeneric entry){
        if ((Boolean) isExists(entry.key)){
            return false;
        }
        return arrayList.add(entry);
    }

    int size(){
        return arrayList.size();
    }



    Object getValueByKey(Object k){
        for (EntryNoGeneric entry : arrayList) {
            if (entry.getKey() == k) {
                return entry.getValue();
            }
        }
        return null;
    }

    Object getValueByNumber(int i){
        return arrayList.get(i).getValue();
    }

    boolean isExists(Object k){
        for (EntryNoGeneric entry : arrayList) {
            if (entry.getKey() == k) {
                return true;
            }
        }
        return false;
    }

    void showTable(){
        System.out.println("Table :");
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(i + " " + arrayList.get(i));
        }
    }

}
