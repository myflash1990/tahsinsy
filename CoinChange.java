/**
 * Created by MacbookPro on 2/9/17.
 */
import java.util.Scanner;

public class CoinChange {

    public static void main(String[] args) {


        int dollars = 0;
        int centsLeft = 0;
        int qtr = 0;
        int dime = 0;
        int nickle = 0;
        int penny = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of coins");
        int cents = input.nextInt();


        dollars = cents/100;
        centsLeft = cents % 100;

        qtr = centsLeft/25;
        centsLeft = centsLeft % 25;

        dime = centsLeft/10;
        centsLeft = centsLeft % 10;

        nickle = centsLeft/5;
        centsLeft = centsLeft % 5;

        penny = centsLeft;


        System.out.println("The total number of coins you entered is: "+ cents);
        System.out.println("No of Dollar bills "+ dollars);
        System.out.println("No of quarters "+ qtr);
        System.out.println("No of dimes "+ dime );
        System.out.println("No of nickles "+ nickle);
        System.out.println("No of pennies "+ penny );



    }



}
