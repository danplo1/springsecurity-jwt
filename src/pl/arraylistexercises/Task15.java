package pl.arraylistexercises;


// Zad. 15 Write a Java program to join two array lists.


import java.util.ArrayList;

public class Task15 {
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

        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("green");
        colorList.add("white");
        colorList.add("red");
        colorList.add("blue");
        colorList.add("purple");
        colorList.add("black");
        colorList.add("yellow");
        System.out.println(colorList);


        ArrayList<String> thirdList = new ArrayList<>();

        thirdList.addAll(carList);
        thirdList.addAll(colorList);

        System.out.println("Nowa lista: " + thirdList);


    }
}
