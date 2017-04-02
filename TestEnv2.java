import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by tahsinsyeed on 4/1/17.
 */
public class TestEnv2 {


    //String name;
    int height;


    public String getName(String name){

        System.out.println(name);
        return name;

    }

    public int getHeight(int height){

        int sum = 0;

        int []c={2,4,5,6};


        for (int xy=0;xy<c.length;xy++){


            sum = sum + c[xy];


        }

        System.out.println("The sum is: "+ sum);

        System.out.println(height);
        return height;

    }

    public void setNameAge(String newName,int age){

        System.out.println(newName);
        System.out.println(newName+" new age is: "+age);

    }


    

    public static void main(String[] args) {

     TestEnv2 obj = new TestEnv2();
       obj.getName("Bertie");
        obj.getHeight(32);

        //Setters and this
        obj.setNameAge("This is my new name",0);

        TestEnv2 obj2 = new TestEnv2();
        obj2.setNameAge("Tahsin",21);

    }

}
