import java.awt.print.Book;
import java.util.Scanner;

/**
 * Created by tahsinsyeed on 4/1/17.
 */
public class StackProblems {

    public static void main(String[] args) {


        //For loop is not breaking after getting the correct value (SOLVED)
        // How to avoid seeing unwanted cases while in 1st iteration (SOLVED)
        //Use scanner for the select case[SOLVED]
        // Use an else statement but make sure it does not have multiple iteration when book not found some how try to bypass until all iterations are complete and then execute the else



        Scanner input = new Scanner(System.in);
        String b = input.nextLine();

        String Books[] = {"Harry Potter", "To Kill a Mocking Bird", "Hunger Games", "David Copperfield"};


        //loop:

        for (int t = 0; t < Books.length; t++) {

            if (b.equals((Books[t]))) {

                System.out.println("Index is in: " + t + " " + Books[t]);
                return;
            }



        }
    }


//            switch (Books [ t ] ) {
//
//                case "Harry Potter":
//
//                    System.out.println("Index is in: " + t + " " + Books[t]);
//
//
//                 break;
//
//                case "To Kill a Mocking Bird":
//
//                    System.out.println("Index is in: " + t + " " + Books[t]);
//
//                    break;
//
//                case "Hunger Games":
//
//                    System.out.println("Index is in: "+ t + " "+ Books[t]);
//
//                    break;
//
//                default:
//
//
//                    break;
                    //System.out.println("Invalid search for book from switch case");




            }







