package pl.arraylistexercises;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    //Task.2 Write a Java program to iterate through all elements in a array list.

    public static void main(String[] args) {

        List<String>colorList = new ArrayList<>();
        colorList.add("green");
        colorList.add("white");
        colorList.add("red");
        colorList.add("blue");
        colorList.add("purple");
        colorList.add("black");
        colorList.add("yellow");

        for (String color: colorList) {
            System.out.println(color);
        }

    }
}
