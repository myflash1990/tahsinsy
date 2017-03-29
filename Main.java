import java.util.Random;

/**
 * Created by tahsin on 3/28/2017.
 */
public class Main {

    public static void main(String[] args) {


        ///// Reverse a sentence
        String sentence = "Hello Tahsin";

        StringBuilder sb = new StringBuilder();
        sb.append(sentence);
        String rev = sb.reverse().toString();
        System.out.println(sentence);
        System.out.println(rev);

        ///// Change dataType from String to int
        String x = "9";
        int y = Integer.parseInt(x);
        System.out.println(y);

        Random gen = new Random(100);
        int user = gen.nextInt(10);
        int pass = gen.nextInt(200);

        while (user <=10 && pass>20){
            user = user+1;
            Class1 obj1 = new Class1();
            obj1.action1(user,pass);
            obj1.login();
            obj1.logout();

            Class1 obj2 = new Class1();
            obj2.action1(user,pass);
            obj2.login();


        }




    }



}
