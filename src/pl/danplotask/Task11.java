package pl.danplotask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Zad. 11 Write a Java program to reverse elements in a array list.
public class Task11 {

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

        Collections.reverse(carList);

        System.out.println("Odwrócenie listy aut do listy samochodów, \n" +
                "Po odwróceniu: " + carList);

    }
}