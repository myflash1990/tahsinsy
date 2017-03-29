/**
 * Created by MacbookPro on 2/7/17.
 */
public class BeerSong {

    public static void main(String[] args) {

        int x = 99;

        String word = "beers";

        for (int j = 100; j >= 0; j--) {

            if (j == 1) {
                word = "beer";
            }
            if (j == 0) {
                // break ;
                continue;
            }

            System.out.println(j + " no of " + word + " on the wall XX");
        }
        while (x > 0) {

            x--;

            if (x == 1) {

                word = "beer";
            }
                if(x==0){
               // break ;
                continue;

            }

            System.out.println(x + " no of " + word + " on the wall XX");
        }

            System.out.println("no more beer left");

    }
}


