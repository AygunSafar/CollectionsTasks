package task2;

import java.util.ArrayList;

public class Task2 {

    // if there is last element, return it.
    public static String returnLastElement(ArrayList<String> list){
        if(list.isEmpty()){
            return "";
        }
        return list.get(list.size()-1);
    }
}
