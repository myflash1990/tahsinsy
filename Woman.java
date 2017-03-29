/**
 * Created by tahsin on 3/16/2017.
 */
import java.util.Scanner;


public class Woman {

    public static void main(String[] args) {

       // int nafisHasMoney = 10;

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a anything");

        //String line = scan.nextLine();2


        int nafisHasMoney = scan.nextInt();



        while (true){

            System.out.println("Woman find him unattractve");
            nafisHasMoney--;

            if(nafisHasMoney==0){

                System.out.println("woman find him attractive");

                String name = "Tahsin";
                double gpa = 3;

                System.out.printf("%s is String. %d is int. %4.2f double ",name,nafisHasMoney,gpa);
                break;
            }

        }

        }
    }









