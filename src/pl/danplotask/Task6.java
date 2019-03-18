package pl.danplotask;

import java.util.ArrayList;
import java.util.List;

public class Task6 {

//Task 6 Write a Java program to remove the third element from a array list.
    public static void main(String[] args) {

        List<String> colorList= new ArrayList<>();

        colorList.add("green");
        colorList.add("white");
        colorList.add("red");
        colorList.add("blue");
        colorList.add("purple");
        colorList.add("black");
        colorList.add("yellow");

        System.out.println(colorList);

        String removeElement = colorList.remove(3);

        System.out.println(colorList + " , usunięty element: " + removeElement);


    }
}
