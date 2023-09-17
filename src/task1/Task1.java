package task1;

import java.util.ArrayList;

public class Task1 {


    //if list is not empty, return the first element of the list
    public static String returnElement(ArrayList<String> list){
        if(!list.isEmpty()){
           return list.get(0);
        }
        return "";
    }

}
