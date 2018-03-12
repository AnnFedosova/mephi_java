package lab3.task2;

public interface Measurable {
    double getMeasure();

    static Measurable largest(Measurable[] objects){
        int maxSelNum = 0;
        int i = 0;
        for (Measurable object : objects){
            if (object.getMeasure() > objects[maxSelNum].getMeasure())
                maxSelNum = i;
            i++;
        }
        return objects[maxSelNum];
    }
}
