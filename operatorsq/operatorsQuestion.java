
/**
 * Write a description of class operatorsQuestion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;
public class operatorsQuestion
{
    /**
     * Constructor for objects of class operatorsQuestion
     */
    public operatorsQuestion(){
        
    }
    public static void main()
    {
        // set stuff up and then call the methods for the questions
        operatorsQuestion questions = new operatorsQuestion();
        questions.operatorq1();
        questions.operatorq2();
        questions.operatorq3();
    }
    
    // first question
    public void operatorq1() 
    {
        ConsoleIO keyboard = new ConsoleIO();
        int ans;
        
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
    }
    
    // second question
    public void operatorq2()
    {
        ConsoleIO keyboard = new ConsoleIO();
        int ans2;
        
        System.out.println("Which operator do you use for assignment?");
        System.out.println("1. GET");
        System.out.println("2. =");
        System.out.println("3. &&");
        System.out.println("4. &");
        System.out.println("ANSWER: ");
        ans2 = keyboard.readInt();
        
        if (ans2 == 2) {
            System.out.println("Correct!\n");
        }
        else {
            System.out.println("Sorry, that's incorrect.\n");
        }
    }
    
    // third question
    public void operatorq3()
    {
        ConsoleIO keyboard = new ConsoleIO();
        int ans3;
        
        System.out.println("What is the symbol for 'or' in Java?");
        System.out.println("1. OR");
        System.out.println("2. |");
        System.out.println("3. &&");
        System.out.println("4. ||");
        System.out.println("ANSWER: ");
        ans3 = keyboard.readInt();
        
        if (ans3 == 4) {
            System.out.println("Correct!\n");
        }
        else {
            System.out.println("Sorry, that's incorrect.\n");
        }
    }
}
