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
    demonsstrates block scopes
*/
public class ScopeDemo {
    public static void main(String args[]){
        int x; //known to all code within main
        
        x = 10;
        if(x == 10) {//start new scope
            int y = 20; // known only to this block
            
            //x and y both known here.
            
            System.out.println("x and y; " + x + " " + y);
            x = y * 2;
        }
  
        //y =100; // Error! y is not known here, it is out of the scope
        
        //x is still known here
        
        System.out.println("x is " + x);
    }
}
