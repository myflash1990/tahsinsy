import java.util.Scanner;

/**
 * Created by tahsin on 3/23/2017.
 */
public class RegtangleAreaPerimeter_Array {

    public static void main(String[] args) {

        

        //Length and width of a rectangle using Scanner

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the width of the rectangle");
        int width = input.nextInt();
        System.out.println("Enter the length of the rectangle");
        int length = input.nextInt();


        //Area of the rectangle
        //Area = l * w
        int area= width * length;
        System.out.println("Area of the rectangle is: "+" "+ area);


        //Perimeter of the rectangle
        //Perimetr = 2(l+w)
        int p = 2 * (length + width);
        System.out.println("Perimeter of the rectangle is: " + " "+p);




        //Use ternary operator
        //Use array in a for loop
        //Do assignment for day 2
        //How to use another method inside main method to change variable inside object

        RegtangleAreaPerimeter_Array obj = new RegtangleAreaPerimeter_Array();
        obj.tahsin();

    }


    public int tahsin(){


        String[] name = new String[90];
        name[34] = "Tahsin";
        System.out.println(name[34
                ]);

        int [] array = new int[8];

        array[1]=90;

        int [] arrtype = {0,1,3,4,12,32};
        System.out.println(arrtype[3]);
        return 89;

    }
}
