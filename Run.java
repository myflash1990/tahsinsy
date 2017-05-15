/**
 * Created by tahsinsyeed on 4/24/17.
 */
public class Run {

    public static void main(String[] args) {

      Die d12 = new Die(12);
      Die normal = new Die(6);

        System.out.println(normal.getSides());
        System.out.println(normal.roll());
        System.out.println(normal.getValue());


    }
}
