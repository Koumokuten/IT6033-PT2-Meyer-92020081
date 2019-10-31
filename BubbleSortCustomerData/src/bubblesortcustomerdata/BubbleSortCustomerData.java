/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortcustomerdata;

/**
 *  Author Meyer Evenblij
 *  24/10/19
 */

public class BubbleSortCustomerData {

    /*
        *@param args the command line arguments
    */
    public void customerRatings(CustomerInformation[] arr) {
      int lastSwap = arr.length-1;
      for(int i=1; i<arr.length; i++) {
        boolean is_sorted = true;
        int currentSwap = -1;

        for(int j=0; j < lastSwap; j++) {
          if(arr[j + 1].getCustomerRating() < arr[j].getCustomerRating()) {
             CustomerInformation temp = arr[j];
             arr[j] = arr[j+1];
             arr[j+1] = temp;
             is_sorted = false;
             currentSwap = j;
             
          }
        }

        if(is_sorted) return;
        lastSwap = currentSwap;
      }
    }
    
    //Bubble sort for the Department Name in desending order
    public void nameSorting(CustomerInformation[] arr) {
      int lastSwap = arr.length-1;
      for(int i=1; i<arr.length; i++) {
        boolean is_sorted = true;
        int currentSwap = -1;
        for(int j=0; j < lastSwap; j++) {
          if(arr[j + 1].getName().compareTo(arr[j].getName()) > 0) {
             CustomerInformation temp = arr[j];
             arr[j] = arr[j+1];
             arr[j+1] = temp;
             is_sorted = false;
             currentSwap = j;             
          }
        }

        if(is_sorted) return;
        lastSwap = currentSwap;
      }
    }
 
    
    //Prints the Array 
    void printArray(CustomerInformation[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i] + " ");
            System.out.println();
            System.out.println();
        }
    }
    
    //Method to test the above
    public static void main(String args[]) {
        BubbleSortCustomerData ob = new BubbleSortCustomerData();
        CustomerInformation arr[] = {
            new CustomerInformation("Tama", 2, "Auckland"),
            new CustomerInformation("Amelia", 5, "Taranaki"),
            new CustomerInformation("Kaos", 3, "Hamilton"),
            new CustomerInformation("Karl", 4, "Papatoetoe"),
            new CustomerInformation("Carlos", 5, "Glenfield"),
            new CustomerInformation("Alicia", 2, "Whangarai"),
            new CustomerInformation("Zion", 2, "Wellington"),
            new CustomerInformation("Sara", 3, "Auckland"),
            new CustomerInformation("Bob", 4, "Papakura"),
            new CustomerInformation("Wiremu", 5, "Auckland")
        };
        //Prints the Unsorted Array
        System.out.println("The Unsorted array is");
        ob.printArray(arr);
        
        //Prints ascending sort
        ob.customerRatings(arr);
        System.out.println("The customer rating ascending: " );
        ob.printArray(arr);
        
        //Prints the descending sort 
        ob.nameSorting(arr);
        System.out.println("The customer name descending: ");
        ob.printArray(arr);
    }
}
    
