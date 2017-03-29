import java.security.PrivateKey;
import java.util.Scanner;

/**
 * Created by tahsin on 3/28/2017.
 */
public class Class1 {

    void action1(int userName,int pass){
       // String userName;
        //int pass;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your user name:" + userName);
        //userName = input.next();
        System.out.printf("Your user name is %d. \n", userName);


       // System.out.println("Your User Name is " + userName);

        System.out.println("Enter your password:"+ pass);

        //pass = input.nextInt();
        System.out.printf("Your password is %d. \n", pass);
    }

    void login(){
        System.out.println("User has clicked the login button");

    }
    void logout(){

        System.out.println("User has logged out");

    }


}
