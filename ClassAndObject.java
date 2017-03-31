/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author tahsinsyeed
 */
 class Cow {
 
 String name;
 int age;
 String year = "Years";


 
 void speak(){
 if ( age >= 2){
 
 }
 else{
 year = "year";
 }
   System.out.println("My name is "+ name + " "+ "I am "+ age +" "+ year + " old");
  
  }
 }


public class ClassAndObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Cow cow1 = new Cow();
        cow1.name = "Barney";
        cow1.age = 1;
          
        cow1.speak();
        
        
        // TODO code application logic here
    }
    
}
