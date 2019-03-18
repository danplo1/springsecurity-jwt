package pl.danplotask;


//Zad.8  Write a Java program to sort a given array list.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task8 {

    public static void main(String[] args) {

    List<String> colorList = new ArrayList<>();

        colorList.add("green");
        colorList.add("white");
        colorList.add("red");
        colorList.add("blue");
        colorList.add("purple");
        colorList.add("black");
        colorList.add("yellow");

        System.out.println("Lista przed posortowaniem: " + colorList);
        System.out.println("");
        Collections.sort(colorList);

        System.out.println("Lista po sortowaniu: " + colorList );


}
}