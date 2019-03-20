package pl.arraylistexercises;

//Zad. 19 Write a Java program to trim the capacity of an array list the current list size

import java.util.ArrayList;

public class Task19 {

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

        colorList.trimToSize();

        System.out.println(" Przycięta lista: " + colorList );
    }
}
