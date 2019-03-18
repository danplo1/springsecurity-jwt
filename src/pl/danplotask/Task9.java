package pl.danplotask;

//Zad. 9 Write a Java program to copy one array list into another

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task9 {

    public static void main(String[] args) {

        List<String> colorList = new ArrayList<>();

        colorList.add("green");
        colorList.add("white");
        colorList.add("red");
        colorList.add("blue");
        colorList.add("purple");
        colorList.add("black");
        colorList.add("yellow");
        System.out.println(colorList);

        List<String> carList = new ArrayList<>();
        carList.add("Toyota");
        carList.add("Mercedes");
        carList.add("Audi");
        carList.add("BMW");
        carList.add("Honda");
        carList.add("Volvo");
        carList.add("Renault");
        System.out.println(carList);

        Collections.copy(colorList,carList);
        System.out.println("Kopiowanie listy kolorów do listy samochodów, \n" +
                "Po kopiowaniu: ");

        System.out.println("Lista kolorów: " + colorList);
        System.out.println("Lista aut: " + carList);

    }


}
