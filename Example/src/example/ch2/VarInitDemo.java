/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.ch2;

/**
 *
 * @author rileyhein
 */

/*
    Demonstrate the lifetime of a variable.
*/
public class VarInitDemo {
    public static void main(String arg[]){
        int x;
        
        for(x = 0; x < 3; x++){
            int y = -1; //y is initiialized each time block is entered
            System.out.println("y is: " + y); //this always prints -1
            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}
//notice that the assigned value of 100 is lost each time the loop is run

