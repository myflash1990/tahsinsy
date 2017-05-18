/**
 * Created by MacbookPro on 5/2/17.
 */
public class ReverseString {


    public static void main(String[] args) {

        String ebay = "$ 14.230";

        System.out.println(ebay);

        String delims;

        delims = ebay.substring(2,7);

        System.out.println(delims);

        double bid = Double.parseDouble(delims);

        System.out.println(bid);



        double add = bid + 0.1;
       System.out.println(add);
//
//        String element = "el5";
//        int x = Character.getNumericValue(ebay.charAt(4));
//        System.out.println("x=" + x);

        String original = "Some string for testing";
        String rev = "";


        // Reverse by every letters in string

        //int len = original.length();

        for (int i = original.length() - 1; i >= 0; i--) {

            rev = rev + original.charAt(i);
        }

        System.out.println(rev);

        // Reverse by word only

        String word = "This will be reversed by words";

        String[] s = word.split(" ");

        // print the original sequence

        for (int i = 0; i < s.length; i++) {

            System.out.println(s[i] + " ");

        }
        // print in reverse sequence with words

        for(int i = s.length-1;i>=0;i--){

            System.out.print(s[i]+" ");
        }



    }

        }



