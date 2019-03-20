package pl.arraylistexercises;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //Task 1. Write a Java program to create a new array list, add some colors (string) and print out the collection

    public static void main(String[] args) {

        List<String> color = new ArrayList<>();

        color.add("green");
        color.add("white");
        color.add("red");
        color.add("blue");
        color.add("purple");
        color.add("black");
        color.add("yellow");

        System.out.println("Lista kolorów " + color);

    }

}


