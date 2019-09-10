
/**
 * Write a description of class operatorQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;
public class operatorQ
{
    // instance variables - replace the example below with your own
    private int errorCode;

    /**
     * Constructor for objects of class operatorQ
     */
    public operatorQ()
    {
        // initialise instance variables
        errorCode = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int askQuestion()
    {
        ConsoleIO keyboard = new ConsoleIO();
        int ans;
        System.out.println("\u000C");
        System.out.println("Which operator do you use to test if two numbers are not equal to each other?");
        System.out.println("1. ==");
        System.out.println("2. =");
        System.out.println("3. !=");
        System.out.println("4. /=");
        System.out.println("ANSWER: ");
        ans = keyboard.readInt();
        
        if (ans == 3) {
            System.out.println("Correct!\n");
        }
        else {
            System.out.println("Sorry, that's incorrect.\n");
        }
        return errorCode;
    }
}
