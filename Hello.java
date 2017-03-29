/**
 * Created by macbookpro on 1/28/17.
 */

public class Hello {

     static String UserName = "Tahsin";

    public static int abc() {

        int x = 10;

        return x * 90;

  }//Udemy Class

    public static String updateDesktop () {

        String happiness;
        happiness = "Infinity happiness is the way to go";
        System.out.println("what are doing here");
        return happiness;

    }

    public static void main(String[] args) {

        System.out.println("Hello, World");

        int abcd = 0;

        abcd = abc();

        System.out.println(abcd + 1 + UserName);


        if (abcd == abc()) {

            System.out.println("Passed test");

            String happiness = updateDesktop();
            System.out.println(happiness);



        }


        else{

            System.out.println("Failed test");

        }
    }
}