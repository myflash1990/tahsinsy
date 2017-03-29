/**
 * Created by MacbookPro on 3/16/17.
 */
import java.util.Random;
import java.util.Scanner;
public class FirstRiddle {


    public static void main(String[] args) {


        Random gen = new Random();

        int getRan = gen.nextInt(10000);

        System.out.println(getRan);

        Scanner scan = new Scanner(System.in);

        System.out.println("How much money do you have?");

        int nafisDollar = gen.nextInt(10);

        //int nafisDollar = scan.nextInt();

        //int nafisgivemoneytowoman=-1;

        System.out.println(nafisDollar);

        while (true){

            System.out.println("woman finds nafis unattractive");
            nafisDollar--;
            //nafisDollar = nafisDollar+nafisgivemoneytowoman;
            //nafisDollar = nafisDollar - 1;

            if (nafisDollar==0){

                System.out.println("woman finds nafis attractive");
                break;
            }


        }


    }
}
