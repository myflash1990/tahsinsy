/**
 * Created by tahsin on 3/17/2017.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Riddle {


    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        boolean continueInput = true;

        do {

            try{

                System.out.println("Enter a value");
                int value = scan.nextInt();

                System.out.println(value);
                continueInput = false;

              }
              catch (InputMismatchException ex){

                  System.out.println("Try again");

              }

            }
            while (continueInput);

         }


}
