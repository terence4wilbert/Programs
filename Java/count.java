import java.io.*;
import java.util.*;

/**
 * Write a description of class Count here.
 * 
 * @author H. Paul Haiduk(Prof)
 * @author Modified by:  Terence Wilbert
 * @version 3.0
 */

    
public class Count
{
    static int integer = 1;
    
    public static void main(String args[])
    {
        int n = getInt("Please enter an integer value greater than or equal to 0");
        
        System.out.println("Should count down to 1");
        countDown(n);
        
        System.out.println();
        System.out.println("Should count up from 1");
        countUp(n);
    }
    
    /**
     * countUp - a recursive function that counts up from 1 to n
     *
     * @param n    the integer value to count up to
     */
    private static void countUp(int n)
    {
        // IMPLEMENT THIS RECURSIVE METHOD
        
        System.out.println(integer);
        integer++;
        if (integer <= n){
            countUp(n);
        }
    }
    
    
    /**
     * countDown - a recursive function that counts down from n to 1
     *
     * @param n    the integer value to count down from
     */
    private static void countDown(int n)
    {
        // IMPLEMENT THIS RECURSIVE METHOD
        System.out.println(n);
        if (n > 1) {
            countDown(n-1);
        }
    }
    
    
    /**
     * Get an integer value
     *
     * @return     an integer 
     */
    private static int getInt(String rangePrompt)
    {
        Scanner input;
        int result = 10;        //default value is 10
        try
        {
            input = new Scanner(System.in);
            System.out.println(rangePrompt);
            result = input.nextInt();
            
        }
        catch(NumberFormatException e)
        {
            System.out.println("Could not convert input to an integer");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }        
        catch(Exception e)
        {
            System.out.println("There was an error with System.in");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }
        return result;
                                    
    }
}