/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author tahsinsyeed
 */


class Women{

    int age;
    double height;
    String color;

    void describe(){



            Scanner input = new Scanner(System.in);

            System.out.printf("Enter your age, %d.\n",age);
            age = input.nextInt();

            System.out.printf("Enter your height, %f",height);
            height = input.nextDouble();

            System.out.printf("Enter your skin color ,%s",color);
            color  = input.next();

        


    }



}
public class TestEnv {
    
    
    public static void main(String[]args){
    
    
        Women woman1 = new Women();
        woman1.describe();

        Women woman2 = new Women();
        woman2.describe();



    }

    
    }
    
    

