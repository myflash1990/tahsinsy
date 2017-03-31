/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package javaapplication1;
import java.util.Random;   

/**
 *
 * @author tahsinsyeed
 */
public class Intellij {
    
    public static void main(String[] args) {
        Random gen = new Random();
        int number = gen.nextInt(100);

        if(number<50) {
            for (number=0;number<50;number++) {
                System.out.println("These random number are less than 50 " + number);
                break;
            }
        }

        else{
            for (number=0;number>50;number++) {
                System.out.println("These numbers are more than 50" + number);
                break;
            }
        }

    }



}
    

