package pl.arraylistexercises;

//Zad. 13 Write a Java program to compare two array lists

import java.util.ArrayList;
import java.util.List;

public class Task13 {
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

        List<String> colorList1 = new ArrayList<>();
        colorList1.add("green");
        colorList1.add("white");
        colorList1.add("red");
        colorList1.add("blue");
        colorList1.add("purple");;

        System.out.println(colorList1);

        ArrayList<String> colList = new ArrayList<>();

        for (String list: colorList) {
            colList.add(colorList1.contains(list)
            ? "Tak" : "Nie");
        }
        System.out.println(colList);
    }
}
