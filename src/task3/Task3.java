package task3;

import java.util.ArrayList;

public class Task3 {

    // returns sum of the elements
    public static Double sum(ArrayList<Double> list) {
        double sum = 0;

        for (Double element : list) {
            sum += element;
        }
        return sum;
    }
}
