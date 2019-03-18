package pl.danplotask;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    //Task5  Write a Java program to update specific array element by given element.

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

         colorList.set(5, "pink");
         colorList.set(6, "braun");

        System.out.println("Ustawienie dwóch ostatnich kolorów na: " + colorList);
    }
}
