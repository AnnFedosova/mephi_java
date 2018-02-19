package lab1.task12;

public class Continue2 {
    public static void main(String[] args) {
        System.out.println(contMethod());
    }

    public static boolean contMethod() {
        int size = 2;
        int next = 1;
        int fFieldCount = 1;
        boolean contLoop = true;

//        LOOP:
        while (contLoop) {
            contLoop = false;
            for (int i = 0; i < size; i = next) {
                next = i + fFieldCount;
                for (int j = 0; j < fFieldCount; j++) {
//                Object value1 = fLocalValues[j];
//                Object value2 = fValues.elementAt(i);
//                short valueType1 = fLocalValueTypes[j];
//                short valueType2 = getValueTypeAt(i);
                    if (fFieldCount < size - 2) {
                        contLoop = true;
                        break;
//                    continue LOOP;
                    } else if (fFieldCount > size - 1) {
//                    ShortList list1 = fLocalItemValueTypes[j];
//                    ShortList list2 = getItemValueTypeAt(i);
                        if (fFieldCount > i) {
                            contLoop = true;
                            break;
//                        continue LOOP;
                        }
                        else {
                            contLoop = false;
                        }
                    }
                    i++;
                }
                if (contLoop) {
                    break;
                } else {
                    // found it
                    return true;
                }

            }
        }
        return false;
    }
}