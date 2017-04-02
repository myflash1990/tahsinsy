import java.util.Random;
import java.util.Scanner;

/**
 * Created by tahsinsyeed on 3/26/17.
 */
public class TestEnv {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        int x = 2;


        switch (x){
            case 2:
                System.out.println("value is 2");
                break;
            case 32:
                System.out.println("value is 32");
                break;
            }

            if (x==2){
                System.out.println("same as switch value is 32");
                System.out.println("Step 1 is complete");

            }

            else if (x==2){
                System.out.println("same value as switch is 2");
                System.out.println("Step 2 is complete");

            }


        //Create a multi dimension array that will show output like a table format


        int[][] grid = {

                {12, 13, 14, 15},
                {30, 40, 50, 60},
                {80, 81, 82, 84}


        };


        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }

            System.out.println();


        }
        //Reverse a string by using STRING BUILDER
        System.out.println("Type a sentence you want to see in reversed format");

        String name = input.nextLine();

        StringBuilder sb = new StringBuilder();

        sb.append(name);
        String reverse = sb.reverse().toString();


        System.out.println(name);
        System.out.println(reverse);


        // The goal is to see how many times the Random class in the for loop would produce values less than 50 and values that are more than 50 for 50 times iteration
        // Expected to see change in value in each iteration

        Random gen = new Random();
        int number = gen.nextInt(100);
        System.out.println(number);


        for (int i = 0; i < number; i++) {

            if (number < 50) {

                System.out.println("number is less than fifty" + " " + number + "\t");
            }

            else {

                System.out.println("number is more than fifty" + " " + number + "\t");
            }
        }

    }
}



