/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author Jaco
 */
public class Example6_17 {
  public static void main(String args[]) { 
 
    System.out.println("val is " + StaticMeth.val); 
    System.out.println("StaticMeth.valDiv2(): " + 
                       StaticMeth.valDiv2()); 
 
    StaticMeth.val = 4; 
    System.out.println("val is " + StaticMeth.val); 
    System.out.println("StaticMeth.valDiv2(): " + 
                       StaticMeth.valDiv2()); 
 
  } 
}