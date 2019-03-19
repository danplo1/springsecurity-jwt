package pl.danplotask;

//Zad.14 Write a Java program of swap two elements in an array list

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task14 {

    public static void main(String[] args) {

        List<String> carList = new ArrayList<>();

        carList.add("Toyota");
        carList.add("Mercedes");
        carList.add("Audi");
        carList.add("BMW");
        carList.add("Honda");
        carList.add("Volvo");
        carList.add("Renault");
        System.out.println("Lista przed: " + carList);
        
        for (String car: carList) {
            System.out.println(car);
        }
        Collections.swap(carList,2, 4);
        System.out.println("Lista po: " );
        for (String car1:carList) {
            System.out.println(car1);
            
        }

    }
}
