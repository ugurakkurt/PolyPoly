
import java.util.Random;

/*
* This class sets up methods that 
* retrieve what random number is to
* be displayed on the die for each 
* one.
*/
public class Roll 
{

	private static int die;

	/*
	 * This method creates the die1
	 * and it assigns a random number
	 * between 1-6 to the die.
	 */
	public static int die()
	{
	    //Create random number generator
	    Random gen = new Random();
	
	    //Uses generator to assign number
	    die = gen.nextInt(6) + 1;
	
	    //Returns die1 value
	    return die;
	}
}