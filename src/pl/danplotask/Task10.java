package pl.danplotask;

//Zad.10 Write a Java program to shuffle elements in a array lis

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task10 {

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


        Collections.shuffle(carList);

        System.out.println("Mieszanie listy kolorów do listy samochodów, \n" +
                "Po wymieszaniu: " + carList);



    }
}
