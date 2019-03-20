package pl.arraylistexercises;

//Zad. 16 Write a Java program to clone an array list to another array list.

import java.util.ArrayList;

public class Task16 {
    public static void main(String[] args) {

        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("green");
        colorList.add("white");
        colorList.add("red");
        colorList.add("blue");
        colorList.add("purple");
        colorList.add("black");
        colorList.add("yellow");
        System.out.println("Oryginalna lista " + colorList);

        System.out.println("");
        colorList.clone();
        System.out.println("Skopiowana lista " + colorList);

    }
}
