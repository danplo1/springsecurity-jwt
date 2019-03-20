package pl.arraylistexercises;


import java.util.ArrayList;

//Zad. 22 Write a Java program to print all the elements of a ArrayList using the position of the elements.
public class Task22 {

    public static void main(String[] args) {

        ArrayList<String> carList = new ArrayList<>();
        carList.add("Toyota");
        carList.add("Mercedes");
        carList.add("Audi");
        carList.add("BMW");
        carList.add("Honda");
        carList.add("Volvo");
        carList.add("Renault");
        System.out.println(" Oryginalna lista:  \n" + carList);

        System.out.println("");

        int numElemenst = carList.size();

        for (int i = 0; i < numElemenst ; i++) {

            System.out.println(carList.get(i));
        }
    }

}
