package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how many Integer values you want to enter");

        int count = scanner.nextInt();

        System.out.println("Lowest Integer Entered was: " + findMin(readIntegers(count)));
    }

    private static int[] readIntegers(int count) {

        System.out.println("Enter " + count + " integer values");
        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }


}


