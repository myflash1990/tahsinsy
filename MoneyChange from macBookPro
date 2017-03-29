/**
 * Created by MacbookPro on 2/10/17.
 */
import java.util.Scanner;
public class MoneyChange {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("buyer pays");
        int x = input.nextInt();
        System.out.println("price of item");
        int y = input.nextInt();

        int giveBack = x-y;

        int cashLeft = 0;
        int hundred = 0;
        int fifty = 0;
        int twenty = 0;
        int ten = 0;
        int five = 0;
        int one = 0;

        hundred = giveBack/100;
        cashLeft = giveBack%100;

        fifty = cashLeft/50;
        cashLeft = cashLeft%50;

        twenty = cashLeft/20;
        cashLeft = cashLeft%20;

        ten = cashLeft/10;
        cashLeft = cashLeft %10;

        five = cashLeft/5;
        cashLeft = cashLeft%5;

        one = cashLeft;


        System.out.println("No of 100s "+hundred);
        System.out.println("No of 50s "+fifty);
        System.out.println("No of 20s "+ twenty);
        System.out.println("No of 10s "+ ten);
        System.out.println("No of 5s "+ five );
        System.out.println("No of 1s  "+ one);
    }
}
