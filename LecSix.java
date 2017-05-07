import java.util.Scanner;

/**
 * Created by tahsinsyeed on 5/7/17.
 */
public class LecSix {

    private String[] item = {"Fish, ", "Meat, ", "Chips, ", "Soda, ", "Chocolate, ", "Milk "};
    private String laneOne = "Lane 1";
    private String laneTwo = "Lane 2";
    private String laneThree = "Lane 3";


    public LecSix() {

        System.out.println("Enter your Item name from the following list to locate it : ");

        for (int i = 0; i < item.length; i++) {
            System.out.printf(item[i]);
        }
    }

    public String where() {

        Scanner input = new Scanner(System.in);
        String o = input.next();

        switch (o) {
            case "Fish":
                System.out.println(laneOne);
                break;
            case "Meat":
                System.out.println(laneOne);
                break;
            case "Chips":
                System.out.println(laneTwo);
                break;
            case "Soda":
                System.out.println(laneThree);
                break;
            case "Milk":
                System.out.println(laneOne);


        }
            return o;

    }

}





