/**
 * Created by tahsinsyeed on 7/22/17.
 */
public class InsertionSorting {


    public static void main(String[] args) {

        int[] num = {9,5,2,1};

//1,2,5,9


        print(sort(num));




    }

    public static void print(int[] list){


        for (int t = 0; t<list.length;t++){

            System.out.println(list[t]);

        }

    }


public static int [] sort(int list[]){


    int i, j, key, temp;


    for (i = 1; i < list.length; i++) {

        key = list[i];

        j = i - 1;

        while (j >= 0 && key < list[j]) {

            temp = list[j];

            list[j] = list[j + 1];

            list[j + 1] = temp;

            j--;
        }


    }

            return list;
}

    }

