/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author Jaco
 */
public class Example9_9 {
  public static void main(String args[]) { 
    try { 
      System.out.println("Before throw."); 
      throw new ArithmeticException(); 
    } 
    catch (ArithmeticException exc) { 
      // catch the exception 
      System.out.println("Exception caught."); 
    } 
    System.out.println("After try/catch block."); 
  } 
}