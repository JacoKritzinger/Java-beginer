/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author Jaco
 */
public class Example5_28 {
  public static void main(String args[]) { 
    int t; 
    byte val;  
  
    val = 123; 
    for(t=128; t > 0; t = t/2) { 
      if((val & t) != 0) System.out.print("1 ");  
      else System.out.print("0 ");  
    } 
  } 
}
