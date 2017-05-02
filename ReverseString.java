/**
 * Created by MacbookPro on 5/2/17.
 */
public class ReverseString {


    public static void main(String[] args) {

        String original = "Some string for testing";
        String rev = "";


        // Reverse by every letters in string

        int len = original.length();

        for (int i = len - 1; i >= 0; i--) {


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



