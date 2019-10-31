/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortcustomerdata;

/**
 *  Author
 *  24/10/19  
 *  The class which stores the customer information
 */
public class CustomerInformation {
    
    private final String name;
    private final int customerRating;
    private final String Address;
    
    //getter method
    public String getName(){
    return name;
    }
    
    public int getCustomerRating(){
    return customerRating;
    }
    
    public String getAddress(){
    return Address;
    }
    
    public CustomerInformation(String newName, int newCustomerRating, String newgetAddress) {
    name = newName;
    customerRating = newCustomerRating;
    Address = newgetAddress;
    }

    @Override
    public String toString() {
        return("Name: " + name + ", Customer Rating: " + customerRating +
               ", Address: " + Address);
    }
}