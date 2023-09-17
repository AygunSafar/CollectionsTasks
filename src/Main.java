import task1.Task1;
import task2.Task2;
import task3.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Task1
        ArrayList<String> l= new ArrayList<>();
        System.out.println( "First element of the list is: "+Task1.returnElement(l));

        //Task2
        ArrayList<String> l2= new ArrayList<>();
        System.out.println("Last element of the list is: "+Task2.returnLastElement(l));

        //Task3
        ArrayList<Double> l3= new ArrayList<>(List.of(3.5,4.2,6.7));
        System.out.println("Sum of the elements is: "+Task3.sum(l3));

        //Task4










    }
}