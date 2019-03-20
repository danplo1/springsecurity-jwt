package pl.arraylistexercises;

import java.util.ArrayList;
import java.util.List;

//Zad.12 Write a Java program to extract a portion of a array list.
public class Task12 {

    public static void main(String[] args) {

        List<String> carList = new ArrayList<>();

        carList.add("Toyota");
        carList.add("Mercedes");
        carList.add("Audi");
        carList.add("BMW");
        carList.add("Honda");
        carList.add("Volvo");
        carList.add("Renault");
        System.out.println(carList);

        List<String> subList = carList.subList(1,5);
        System.out.println(subList);

    }
}
