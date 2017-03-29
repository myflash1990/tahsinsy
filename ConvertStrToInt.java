import java.util.Random;


/**
 * Created by tahsin on 3/17/2017.
 */
public class ConvertStrToInt {
    public static void main(String[] args) {



        String x = "2";
        String y = "3";



        int i = Integer.parseInt(x);
        int m = Integer.parseInt(y);

        System.out.println(i+m);

    //Classes,Objects, class library(use existing classes and declaring objects


        //import build in class from JDK that generates random number
        Random gen = new Random();

        int t = gen.nextInt(100);
        System.out.println(t);
        t = gen.nextInt(100);
        System.out.println(t);

        System.out.println(hello(1,1));




    }


    public static int hello(int cal,int bal){


        return cal+bal;

    }

}
