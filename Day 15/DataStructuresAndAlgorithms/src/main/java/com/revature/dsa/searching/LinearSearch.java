package com.revature.dsa.searching;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        int[] numbers = new int[numElements];

        System.out.println("Enter the " + numElements + " elements:");
        for (int i = 0; i < numElements; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to search: ");
        int targetValue = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < numElements; i++) {
            if (numbers[i] == targetValue) {
                System.out.println(targetValue + " is found at position " + (i + 1) + ".");
                found = true;
                break;
            }
        }

        if (!found) 
        {
            System.out.println(targetValue + " is not present in the array.");
        }
    }
}
