/**
 * Basics for programming in Java
 *
 * @author (me)
 * @version (a version number or a date)
 */

import chn.util.*;
public class CountdownSong2
{ // everything in Java is a class, we will learn more latter
    
    public static void main()
    { // code blocks are in curly braces {}
        // initialise control variables for program
        ConsoleIO keyboard = new ConsoleIO();
        int countdown;               // integer variable assignment, statements end in semi colon
        String bedJumpers; // string of characters 
        
        System.out.println("Name your jumper:");
        bedJumpers = keyboard.readLine();
        System.out.println("How many jumps?");
        countdown = keyboard.readInt();

        // prepare for countdown loop
        int i = countdown;
        String space = " ";
        for (i = countdown; i > 0; i--) { 
                // messages print each time through loop,  println prints a line to console, plus sign (i + space...) concatonates
                System.out.println(i + space + "little" + space + bedJumpers + "s" + space + "jumping on the bed");
                System.out.println("One fell off and broke his head");
                System.out.println("Mama called the doctor and the doctor said");
                System.out.println("no more " + bedJumpers + "s" + " jumping on the bed.");
        }    
        System.out.println("Zero little" + space + bedJumpers + "s");
    }

    
}