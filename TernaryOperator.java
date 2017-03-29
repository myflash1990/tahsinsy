import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by tahsin on 3/19/2017.
 */
public class TernaryOperator {


    public static void main(String[] args) {

//YouTube video lesson 2

        Scanner input = new Scanner(System.in);






        double gpa;
        String YorN;
        String randomNumber = "tas123";

        Random rnd = new Random();
        StringBuilder sn = new StringBuilder(10);

        for (int i =0;i<10;i++){


            sn.append(randomNumber.charAt(rnd.nextInt(randomNumber.length())));

        }
            String contain = sn.toString();
        System.out.println("Here is the random set of number "+ contain);

        System.out.println("Enter GPA");
        gpa = input.nextDouble();
        YorN = gpa > 3.2 ? "Deans list" : "";
        System.out.println(YorN);


        SecureRandom test = new SecureRandom();

        String tester = test.toString();
        System.out.println("Lets see the value of this class " + tester);





            System.out.println("what is greet(Hello or Hi)");
            int m = input.nextInt();

            if (m == 1) {
                System.out.println("hello Onaisee 1 says hello");
            } else if (m == 2) {
                System.out.println("Hi Onaisee 2 says Hi");

            }
            else {
                System.out.println("code failed to compile");

            }



        String heshe;

        boolean isFemamle;

        System.out.println("Are you female(True/False)");
        isFemamle = input.nextBoolean();

        //if true then She else He (Ternary operator)
        heshe = isFemamle ? "She":"He";

        System.out.println(heshe);

//---------------------------------------------------------------------------------------------

        System.out.println("Are you a boy or a girl?");
       // gender = input.next();

     switch (heshe){
         case "He" :
             System.out.println("I am a boy");
             break;
         case "She":
             System.out.println("I am a girl");
             break;
         default:
             System.out.println("Invalid gender");


//
//             try
//                 catch
//             continue
//                     finally

        }

        }


    }


