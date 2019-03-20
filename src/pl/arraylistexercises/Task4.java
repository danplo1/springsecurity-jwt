package pl.arraylistexercises;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    // Task 4 Write a Java program to retrieve an element (at a specified index) from a given array list.

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

        String element1 = colorList.get(4);
        String element2 =  colorList.get(6);

        System.out.println("Pierwszy element" + element1);
        System.out.println("Pierwszy element" + element2);
    }

}
