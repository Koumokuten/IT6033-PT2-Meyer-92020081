/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasort;

import java.util.Arrays;
import java.util.Comparator;

/**
 *  Author Meyer Evenblij
 *  30/10/19
 *  This program uses a java sort algorithm to sort out the array. 
 */
public class JavaSort {

    
    //Prints the Array
    void printArray(CatalogueItem arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(
                    "id: " + arr[i].getItemId() + " "
                    + "name: " + arr[i].getItemName() + " "
                    + "category: " + arr[i].getCategory() + "\n");
        System.out.println();
        System.out.println();
    }
    
    
    static class itemId implements Comparator<CatalogueItem> { 
        //Sorts the Id in ascending order
        public int compare(CatalogueItem a, CatalogueItem b) { 
            return a.getItemId() - b.getItemId(); 
        } 
    } 
    
    
    static class sortByCategory implements Comparator<CatalogueItem> { 
        //Sorts the category in alphabetical order
        public int compare(CatalogueItem a, CatalogueItem b) { 
            return a.getCategory().compareTo(b.getCategory()) ; 
        } 
    } 
    
    
    //Method to test above
    public static void main(String args[]) {
        JavaSort ob = new JavaSort();
        
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
        
        System.out.println("The array sorted by id using Java's Inbuilt Sort is");
        Arrays.sort(arr, new itemId()); 
        ob.printArray(arr);
        
        System.out.println("The array sorted by category using Java's Inbuilt Sort is");
        Arrays.sort(arr, new sortByCategory());
        ob.printArray(arr);   
        
        System.out.println("I found 'Java Sort' to be the preferred algorithm."
                + "It sorts through the algorithm faster according to Big O (computer science related)mathematics,"
                + "regarding polynomial time. Of course this depends on the purpose that the algorithm is being used. "
                + "According to the type of data being used I found 'Best Case' the most appropriate.");
                
    }
}
