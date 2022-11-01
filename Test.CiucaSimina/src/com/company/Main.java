package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // We initialize an empty list of Integer type
        ArrayList<Integer> numbersList = new ArrayList<>();
        // We initialize a scanner to use for reading the number of elements in the list
        Scanner input = new Scanner(System.in);

        System.out.print("Please specify the number of elements in the list: ");
        // We read from keyboard the number of elements
        int numberofElements = input.nextInt();

        //We populate the list with numbers from 1 to n; n being the number saved in variable numberofElements
        for (int i = 1; i <= numberofElements; i++) {
            numbersList.add(i);
        }

        // We print the numbers from our list to be sure that everything is ok
        System.out.print("The numbers stored in the list are: ");
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.print(numbersList.get(i) + " ");
        }

        // We calculate the sum of numbers in the list
        int sumA = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            sumA = sumA + numbersList.get(i);
        }
            System.out.println("The sum is: " + sumA);

        // We extract one number from the list
        Random rand = new Random();
        int n = rand.nextInt(numberofElements);
            System.out.println(n);

        // We initialize another empty list of Integer type
        ArrayList<Integer> numbersList2 = new ArrayList<>();

        // We populate the second list with numbers from 1 to n; n being the number saved in variable numberofElemets
        for (int i = 1; i <= numberofElements; i++) {
            numbersList2.add(i);
        }

        numbersList2.remove(n);

        //We print the numbers from our second list to be sure that everything is ok
        System.out.print("The numbers stored in the list are: ");
        for (int i = 0; i < numbersList2.size(); i++) {
            System.out.print(numbersList2.get(i) + " ");
        }

        // We calculate the sum of numbers in the list
        int sumB = 0;
        for(int i = 0; i < numbersList2.size(); i++) {
            sumB = sumB + numbersList2.get(i);
        }

        System.out.println("The sum is: " + sumB);
        System.out.println("The removed number is: " + (sumA - sumB));

    }
}
