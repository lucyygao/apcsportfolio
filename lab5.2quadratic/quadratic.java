
/**
 * Write a description of class quadratic here.
 *
 * @author Lucy Gao
 * @version 91219
 */
/* PSEUDOCODE 
 * - create object?
 * - create function that gets inputted a,b,c
 * - function that solves for the two answers
 * - function that prints the results 
 */

import java.lang.Math;
import chn.util.*;

public class quadratic
{
    public static void main()
    {
        ConsoleIO keyboard = new ConsoleIO();
        double first, sec, third;
        double ans1, ans2;
        
        // get input
        System.out.println("The format of the equation is ax^2 + bx + c = 0.");
        System.out.println("Please enter the value of 'a': ");
        first = keyboard.readDouble();
        System.out.println("Please enter the value of 'b': ");
        sec = keyboard.readDouble();
        System.out.println("Please enter the value of 'c': ");
        third = keyboard.readDouble();
        
        // solve
        ans1 = ((-(sec) + Math.sqrt((sec*sec) - 4*first*third))/(2*first));
        ans2 = ((-(sec) - Math.sqrt((sec*sec) - 4*first*third))/(2*first));
        
        // print formatted + limited output
    }
    
}
