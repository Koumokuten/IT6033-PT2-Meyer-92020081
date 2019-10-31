/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *  Author Meyer Evenblij
 *  26/10/19
 *  Using a "Quick Sort" Algorithm to sort as requested
 */

public class QuickSort {
    
    private CatalogueItem[] items;
    private int number;
    static int counter = 0; 

    public void sort(CatalogueItem[] values) {
        //Checking the Array for values "empty" or "null" 
        if (values ==null || values.length==0){
            return;
        }
        this.items = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        //Get the pivot element
        int pivot = items[low + (high-low)/2].getItemId();

        //Divide into two lists
        while (i <= j) {
            // If value from the left list is smaller than the pivot element, 
            //get the next element from the left list
            while (items[i].getItemId() < pivot) {
                i++;
                counter++;
            }
            // If value from the right list is larger than the pivot element, 
            //get the next element from the right list
            while (items[j].getItemId() > pivot) {
                j--;
                counter++;
            }

            //If value in the left list is larger than the pivot element and;
            //if a value in the right list smaller than the pivot element 
            //then exchange the values
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }

            counter++;
        }
        //Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        CatalogueItem temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

 
    //Prints the Array 
    void printArray(CatalogueItem arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(
                    "id: " + arr[i].getItemId() + " "
                    + "name: " + arr[i].getItemName() + " "
                    + "category: " + arr[i].getCategory() + "\n");
        System.out.println();
        System.out.println();
    }
    
        private void quicksort2(int low, int high) {
        int i = low, j = high;
        //Get pivot element from the middle of the list
        int pivot = items[low + (high-low)/2].getItemId();

        //Divide into two lists
        while (i <= j) {
            //If value from the left list is smaller than the pivot element,
            //get the next element from the left list
            while (items[i].getItemId() < pivot) {
                i++;
            }
            //If value from the right list is larger than the pivot belement, 
            //get the next element from the right list
            while (items[j].getItemId() > pivot) {
                j--;
            }

            //If value in the left list is larger than the pivot element and;
            //if value in the right list is smaller than the pivot element, 
            //then exchange the values
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;

            }
        }
        //Recursion
        if (low < j)
            quicksort2(low, j);
        if (i < high)
            quicksort2(i, high);
    }

    private void exchange2(int i, int j) {
        CatalogueItem temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

 
    //Prints the Array
    void printArray2(CatalogueItem arr2[])
    {
        int n = arr2.length;
        for (int i=0; i<n; ++i)
            System.out.print(
                    "id: " + arr2[i].getItemId() + " "
                    + "name: " + arr2[i].getItemName() + " "
                    + "category: " + arr2[i].getCategory() + "\n");
        System.out.println();
        System.out.println();
    }    
    //Method to test above
    public static void main(String args[])
    {
        QuickSort ob = new QuickSort();
        
        CatalogueItem arr[] = {
            new CatalogueItem( 3, "Life of Pi","Books"),
            new CatalogueItem( 7, "Deelongie 4 way toaster","Home and Kitchen"),
            new CatalogueItem( 2, "Glorbarl knife set","Home and Kitchen"),
            new CatalogueItem( 4, "Diesorn vacuum cleaner","Appliances"),
            new CatalogueItem( 5, "Jennie Olivier sauce pan","Home and Kitchen"),
            new CatalogueItem( 6, "This book will save your life","Books"),
            new CatalogueItem( 9, "Kemwould hand mixer","Appliances"),
            new CatalogueItem( 1, "Java for Dummies","Books"),
        };
        
        CatalogueItem arr2[] = {
            new CatalogueItem( 9, "Life of Pi","Books"),
            new CatalogueItem( 7, "Deelongie 4 way toaster","Home and Kitchen"),
            new CatalogueItem( 6, "Glorbarl knife set","Home and Kitchen"),
            new CatalogueItem( 5, "Diesorn vacuum cleaner","Appliances"),
            new CatalogueItem( 4, "Jennie Olivier sauce pan","Home and Kitchen"),
            new CatalogueItem( 3, "This book will save your life","Books"),
            new CatalogueItem( 2, "Kemwould hand mixer","Appliances"),
            new CatalogueItem( 1, "Java for Dummies","Books"),
        };
        System.out.println("The Unsorted array is");
        ob.printArray(arr);
        
         //Apply sort
        ob.sort(arr);
        System.out.println("Total number of comparisons for first array: " + counter);
        System.out.println("The Quick Sorted array is");
        ob.printArray(arr);
        
        ob.sort(arr2);
        System.out.println("The Quick Sorted array in Reverse");
        System.out.println("Total number of comparisons reverse: " + counter);
        ob.printArray2(arr2);
    }
}
