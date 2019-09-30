/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;
// THIS PROGRAM WILL TO SHOW HOW TO FIND A DIGIT IN A STRING//
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
       
        String myString = "Jarryd is 20 years old";
        
        char[] mychar = myString.toCharArray();
        
        for(Character c : mychar){
            
            if( Character.isDigit(c)){
            
                System.out.println("There is a digit " + c );}
            
          }
        
        //String regex = ".*\\d*.";
        
    }
    
}
