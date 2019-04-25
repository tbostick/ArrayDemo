package com.company;


import java.util.Scanner;


public class Array4 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double sum = 0.0;
        double average = 0.0;

        double[] array;
        array = new double[10];

        String[] names = new String[3];

        for (int i = 0; i < array.length; i++) // used for loop for user input
        {
            System.out.println("Enter a number");
            array[i] = keyboard.nextInt(); // Assigned users value to array
        }
        {
            for (int i = 0; i < 10; i++)  // for loop to display values

                System.out.println("Values are :" + array[i]);
        }
        for (int counter = 0; counter < array.length; counter++) {
            sum += array[counter];
        }
        {
            System.out.println("The sum of the numbers is " + sum);
        }
        {
            average = sum / array.length;
            System.out.println("The average of the sum of the array is " + average);
        }

        }
    }
