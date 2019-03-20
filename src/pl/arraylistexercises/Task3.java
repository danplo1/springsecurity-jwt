package pl.arraylistexercises;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    //Task 3 Write a Java program to insert an element into the array list at the first position.

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

        colorList.add(0,"white");
        colorList.add(1, "red");

        System.out.println(colorList);

        colorList.add(1, "blue");

        System.out.println(colorList);
    }
}
