import java.util.Random;
import java.util.Scanner;

/**
 * Created by tahsin on 3/26/2017.
 */

public class TestEnv {

        int numberOfSides;
        int ta;

        public void roll(int numberOfSides){

            System.out.println("Dice has rolled");
            Random ta = new Random(10);
            int run = ta.nextInt(9);
            this.numberOfSides = 90;
        }

    public void cons(){
        this.numberOfSides =1;
    }
//
   void houseSpecs(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of rooms");
       int rooms=input.nextInt();
       System.out.println("Enter year build");
      int yearBuild=input.nextInt();
       System.out.println("Enter the area");
       int area=input.nextInt();
       System.out.printf("the house has %s rooms, it was built in %s and it has area of %s square feet.",rooms,yearBuild,area);

    }

    public static void main(String[] args) {





        System.out.println(hello(8, 9));

        int [] str = {1,3,24,42,32,123,3213,32,1312,312,31,231};

        for (int arr : str){

            System.out.print(arr+"\t");

        }

        //object has behaviour (method) and specific values that the class requires it to have
        System.out.println();


        TestEnv obj = new TestEnv();
        obj.houseSpecs();

        Scanner input = new Scanner(System.in);
        boolean hangdrum;
        String isCool;
        System.out.println("Is hang drum cool? true/false");
        hangdrum = input.nextBoolean();

        isCool = hangdrum ? "hang drum is cool" : "";

        System.out.println(isCool);


        int salary = 72000;

        if (salary >= 70 && salary <= 85000) {
            System.out.println("we have a deal");

        }


    }

    public static int hello(int x, int y) {

        System.out.println("Sum of X and Y is: ");
    return x + y;

    }

}
