package pl.arraylistexercises;

//Zad.20 Write a Java program to increase the size of an array list

import java.util.ArrayList;

public class Task20 {
    public static void main(String[] args) {

        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("green");
        colorList.add("white");
        colorList.add("red");
        colorList.add("blue");
        colorList.add("purple");
        System.out.println("Oryginalna lista " + colorList);

        ArrayList<String> colorList1 = new ArrayList<>();
        colorList1.add("black");
        colorList1.add("grey");
        colorList1.add("yellow");
        colorList1.add("orange");
        colorList1.add("brown");
        System.out.println("");

        colorList.ensureCapacity(5);
         colorList.add("black");
         colorList.add("grey");
         colorList.add("yellow");
         colorList.add("orange");
         colorList.add("brown");

        System.out.println("Nowa lista, zwiększona z ensureCapacity: " + colorList);

        System.out.println("");
        //lub
        colorList.addAll(colorList1);

        System.out.println("Nowa lista, zwiększona: " + colorList);


    }


}
