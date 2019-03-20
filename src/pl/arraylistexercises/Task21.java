package pl.arraylistexercises;

//Zad. 21 Write a Java program to replace the second element of a ArrayList with the specified element

import java.util.ArrayList;

public class Task21 {

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

        System.out.println("oryginalna lista: " + carList);

       String newCar = "Mazda";
       carList.set(4, newCar);

       String newCar1 = "Ferrari";
       carList.set(6, newCar1);

        System.out.println("Nowa lista, z podmienonymi autami: " + carList);

    }
}
