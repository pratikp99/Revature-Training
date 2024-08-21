package com.revature.dsa.sorting;
import java.util.*;

public class QuickSort {
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
	        
	        quickSort(array, 0, n - 1);
	        
	        System.out.println("Sorted array:");
	        for (int i : array) 
	        {
	            System.out.print(i + " ");
	        }
	    }

	    public static void quickSort(int[] array, int low, int high) 
	    {
	        if (low < high) 
	        {
	            // Partition the array and get the pivot index
	            int pivotIndex = partition(array, low, high);
	            
	            // Recursively sort elements before and after the pivot
	            quickSort(array, low, pivotIndex - 1);
	            quickSort(array, pivotIndex + 1, high);
	        }
	    }

	    private static int partition(int[] array, int low, int high) 
	    {
	        int pivot = array[high];
	        int i = (low - 1); 
	        
	        for (int j = low; j < high; j++) 
	        {
	            if (array[j] <= pivot) 
	            {
	                i++;
	                
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }
	        
	        // Swap array[i + 1] and array[high] (pivot)
	        int temp = array[i + 1];
	        array[i + 1] = array[high];
	        array[high] = temp;
	        
	        return i + 1;
	    }
}
