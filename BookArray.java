import java.util.Scanner;

/**
 * Created by tahsinsyeed on 4/1/17.
 */
public class BookArray {


    public static void main(String[] args) {

        String Books[ ]= {"Harry Potter","To Kill a Mocking Bird","Hunger Games"};

        for (int t = 0; t < Books.length; t++ ) {

            switch (Books [ t ] ) {

                case "Harry Potter":

                    System.out.println("Index is in: " + t + " " + Books[t]);


                    break;

                case "To Kill a Mocking Bird":

                    System.out.println("Index is in: " + t + " " + Books[t]);

                    break;

                case "Hunger Games":

                    System.out.println("Index is in: "+ t + " "+ Books[t]);

                    break;

                default:
                    break;
                //System.out.println("Invalid search for book from switch case");
            }
        }


        for (int i = 0; i<Books.length;i++) {


            //Look for a specific book called

            if (Books[i] == "Harry Potter") {

                System.out.println(i + " " + Books[i]);
                //break;
            }

            else if(Books[i] == "To Kill a Mocking Bird"){

                System.out.println(i + " " + Books[i]);
                break;


            }

            else {

                System.out.println("Invalid book");
                break;
            }


        }
// Problem is that break is not working as expected in this loop after finding the case "Harry Potter" the loop should stop but it is not it is also going into the next case



        // See all the content in the array and for each item write the index location
        for (int n=0;n<Books.length;n++){

            System.out.println("Index of the book: "+ Books[n]+" "+"is "+ n);
            //break;

            }

        }


    }

