package pl.arraylistexercises;

//Zad. 17 Write a Java program to empty an array list

import java.util.ArrayList;

public class Task17 {
    public static void main(String[] args) {

        ArrayList<String> carList = new ArrayList<>();
        carList.add("Toyota");
        carList.add("Mercedes");
        carList.add("Audi");
        carList.add("BMW");
        carList.add("Honda");
        carList.add("Volvo");
        carList.add("Renault");
        System.out.println(carList);

       carList.removeAll(carList);

        System.out.println("Pusta lista: " + carList);

    }

}
