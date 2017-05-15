import java.util.Random;

/**
 * Created by tahsinsyeed on 4/24/17.
 */
public class Die {

    /*
    * roll
    * getSides
    * setSides
    * */

    private int sides;
    private int value;
    private Random gen;

    public Die(int sides){
        this.sides = sides;
        gen = new Random();

        // Initial value of the die (before rolling)
        this.value = this.roll();
    }
    // Overloading method

    public Die(int sides,int seed){
        this.sides = sides;
        this.gen = new Random(seed);
    }

    public void setSides(int sides) {
        this.sides = sides;

    }

    public int getSides(){
        return this.sides;
    }

    public int getValue(){
        return this.value;
    }

    public int roll (){
        this.value = this.gen.nextInt(this.sides) +1;
        return this.value;
    }

}
