/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.ch1;

/**
 *
 * @author rileyhein
 */
/*
Demonstrates the For loop

Call thsi fileForDemo.java
*/
public class ForDemo {
    public static void main(String args[]) {
        int count;
        
        for(count = 0; count < 5; count++)//this loop iterates 5 times at 1 integer intervals
            System.out.println("This is count: " + count);
        
        System.out.println("Done!");
    }
    
}
