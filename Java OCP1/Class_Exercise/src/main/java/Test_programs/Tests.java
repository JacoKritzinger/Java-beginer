/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_programs;


/**
 *
 * @author Jaco
 */
public class Tests {
    public void switchString(String input){
            switch (input){
                case "a" : System.out.println( "apple");
                case "b" : System.out.println( "bat");
                    break;
                case "B" : System.out.println( "big bat" );
                default : System.out.println("none" );
                
                
            }        }
            
    public static void main (String[] args) throws Exception {
        Tests tc = new Tests();
        tc.switchString("B");
    }
}
