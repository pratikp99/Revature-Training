package com.revature.dsa.sorting;
import java.util.*;

public class SelectionSort {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            array[i] = scanner.nextInt();
        }
        
        selectionSort(array);
        
        System.out.println("Sorted array:");
        for (int i : array) 
        {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] array) 
    {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (array[j] < array[minIndex]) 
                {
                    minIndex = j;
                }
            }
            
            if (minIndex != i) 
            {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
