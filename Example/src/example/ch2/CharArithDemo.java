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
public class CharArithDemo {
    public static void main(String args []){
        char ch;
        
        ch = 'X';
        System.out.println("ch contains " + ch);
        
        ch++; //incriment ch (meaning that the ch after x is y)
        System.out.println("ch is now" + ch);
        
        ch = 90; //give ch the value z (ASCII unicode 90 is Z)
        System.out.println("ch is now " + ch);
        
    }
    
}
