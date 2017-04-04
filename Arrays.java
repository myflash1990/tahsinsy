/**
 * Created by tahsin on 3/22/2017.
 */
public class Arrays {
    public static void main(String[] args) {

        //John Pascal video section

        //method one of writing array
        int [] str = {1,3,24,42,32,123,3213,32,1312,312,31,231};

        //method 2 of writing array
        int [] intarry = new int[4];
        intarry[3] = 43;

        int[] value;
        value = new int[5];

        value[1] = 90;
        value[0] = 10;
        value[2] = 12;

        System.out.println(value[1]);
        System.out.println(value[2]);

        //Creating String arrays

        String[] words = new String[5];
        words[2] = "Fruit";
        words[4] = "Cars";
        words[1] = "Humans";

        for (String word: words) {
            System.out.println(word);

            String[] frutis = {"Apple", "Banana"};

            for (String fruit : frutis) {
                System.out.println(fruit);
            }

            for (int inter = 0; inter < value.length; inter++) {

                System.out.println("Iteration number " + " " + inter + " " + value[inter]);

            }
            //Multi dimensional array
            int[][] multi = {
                    {12, 32, 32, 43, 543},
                    {1, 2, 3, 4, 5, 6, 7, 8}

            };
//calling specefic loaction of the multi dimentional array
            //(row and then col)
            System.out.println("I want to see the number two " + multi[1][1]);
//.length
            //Getting array on a for loop

            int[][] grid = {
                    {1, 2, 3, 4},
                    {10, 20, 30, 40},
                    {100, 200}
            };
            //itetatior row first then col


            for (int row = 0; row < grid.length; row++) {

            //length of the array
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col]+"\t");

            }
                System.out.println();
        }


            }


//Tim Section 9 Lecture 54

            int[] myVar = new int[8];

            myVar[3] = 8;
            myVar[0] = 1;
            myVar[1] = 90;
            myVar[2] = 80;

            System.out.println(myVar[3]);


            double[] myDouble = new double[4];

            myDouble[3] = 90.90;

            System.out.println(myDouble[3]);

            //Alternative way of assigning values in array

            int[] myint = {1, 2, 3, 4};

            System.out.println(myint[3]);

            // 3rd way to assign arrays

            int[] thirdWay = new int[400];


            for (int i = 0; i < 10; i++) {

                thirdWay[i] = i * 101;

                System.out.println(thirdWay[i]);

                // Using .length

                int[] thirdWay2 = new int[20];


                for (int y = 0; y < thirdWay.length; y++) {
                    thirdWay2[y] = y * 10;
                    System.out.println(y + " " + thirdWay2[y]);

                }
            }
        }


    //Pass down array to a method

           public static void printArray(int[]array){

            for (int y = 0; y < array.length; y++) {


                array[y] = y * 10;


                System.out.println(y + " " + array[y]);

            }




           }

       }





