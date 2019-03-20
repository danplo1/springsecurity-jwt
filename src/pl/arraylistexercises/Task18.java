package pl.arraylistexercises;


//Zad. 18 Write a Java program to test an array list is empty or not

import java.util.ArrayList;

public class Task18 {
    public static void main(String[] args) {

        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("green");
        colorList.add("white");
        colorList.add("red");
        colorList.add("blue");
        colorList.add("purple");
        colorList.add("black");
        colorList.add("grey");
        colorList.add("yellow");
        colorList.add("orange");
        colorList.add("brown");
        System.out.println("Lista " + colorList);

        System.out.println("Sprawdzam czy lista jest pusta" + colorList.isEmpty());
        System.out.println("Lista nie jest pusta.");
        System.out.println("");

        colorList.removeAll(colorList);

        System.out.println("Sprawdzam czy lista jest pusta " + colorList);
        System.out.println("Lista jest pusta.");

    }

}
