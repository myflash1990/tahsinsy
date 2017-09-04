import java.io.File;
import java.util.Scanner;

public class ReadFileFromText {

    public static String store ="";


    public static void main(String[] args) throws Exception {


        String filePath = "\\C:\\Users\\tahsi\\Desktop\\New Text Document.txt";

        File path = new File(filePath);

        Scanner read = new Scanner(path);

        while (read.hasNextLine()){

           String line = read.nextLine();
           store += line;
        }

        String[] s = store.split(" ");

        for (int i = 0;i<=s.length;i++){

            System.out.println(s[i]);
        }


        //System.out.println(store);

        read.close();
    }


}
