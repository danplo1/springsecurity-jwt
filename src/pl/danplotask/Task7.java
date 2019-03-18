package pl.danplotask;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {

    //Zad. 7 Write a Java program to search an element in a array list.

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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kolor: ");
        String color = scanner.nextLine();

        System.out.println(colorList.contains(color)
                            ? "Element odnaleziony."
                            : "Brak elementu.");

    }

}
