/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

/**
 *
 * @author Jaco
 */
public class Example3_26 {
  public static void main(String args[])   
    throws java.io.IOException { 
 
    char ch; 
 
    for( ; ; ) { 
      ch = (char) System.in.read(); // get a char 
      if(ch == 'q') break; 
    } 
    System.out.println("You pressed q!"); 
  }   
}
