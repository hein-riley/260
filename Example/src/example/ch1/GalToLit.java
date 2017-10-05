package example.ch1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rileyhein
 */
/*
This is 1 - 1

This program converts Gallons to Liters

Call this program GalToLit.java.
*/
public class GalToLit {
    public static void main(String args[]) {
        double gallons; //holds the number of gallons
        double liters; //hods the number of liters
        
        gallons = 10; // start with 10 gallons
        
        liters = gallons * 3.7854; //converts to liters
        
        System.out.println(gallons + "gallons is " + liters + " liters.");
    }
}
