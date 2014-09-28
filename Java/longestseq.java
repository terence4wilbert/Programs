

import java.io.*;
import java.util.*;

/**
 * LongestCommonSubsequence is a program that will determine the longest string
 * that is a subsequence of two input strings. This program applies a brute
 * force solution technique.
 * 
 * @author H. Paul Haiduk
 * @edited by Terence Wilbert
 * @version 3.0
 */
public class LongestCommonSubsequence {

    public static void main(String args[]) {
        BagInterface<String> toCheckContainer = null;

        Scanner input;
        input = new Scanner(System.in);

        System.out
                .println("This program determines the longest string that is a subsequence of two input string.");
        System.out.println("Please enter the first string:");
        String first = input.next();

        System.out.println("Please enter the second string:");
        String second = input.next();

        // ADD CODE HERE TO CREATE THE BAG WITH THE INITIAL STRING
        toCheckContainer = new ArrayBag<String>();
        toCheckContainer.add(first);
        toCheckContainer.add(second);
        
        
        System.out.println("The strings to check are: " + toCheckContainer);
        String bestSubsequence = new String("");

        // ADD CODE HERE TO CHECK THE STRINGS IN THE BAG
        int a,b;
        int n = first.length();
        int m = second.length();
        int[][] c = new int [n + 1][m + 1];
        int[][] d = new int [n + 1][m + 1];
        
        for (a = 0; a <= n; a++) {
            c[a][0] = 0;
            }
        
        for (b = 0; b <= m; b++) {
            c[0][b] = 0;
            }
        
        for (a = 1; a <= n; a++) {
            for (b = 1; b <= m; b++) {
                if (first.charAt(a - 1) == second.charAt(b - 1)) {
                    c[a][b] = c[a - 1][b - 1] + 1;
                    d[a][b] = 1; /* diagonal */
                }
                else if (c[a - 1][b] >= c[a][b - 1]) {
                    c[a][b] = c[a - 1][b];
                    d[a][b] = 2; /* down */
                }
                else {
                    c[a][b] = c[a][b - 1];
                    d[a][b] = 3; /* forward */
                }
            }
        } 
        bestSubsequence = new String();
        a=n;
        b=m;
        
        while (a != 0 && b != 0) {
            if (d[a][b] == 1) { /* diagonal */
                bestSubsequence = first.charAt(a - 1) + bestSubsequence;
                a = b - 1;
                a = b - 1;
            }
            if (d[a][b] == 2) { /* up */
                a = a - 1;
            }
            if (d[a][b] == 3) { /* backward */
                b = b - 1;
            }
        } 
        System.out.println("Found " + bestSubsequence
                + " for the longest common subsequence");

    }

    /**
     * Determine if one string is a subsequence of the other
     * 
     * @param check
     *            see if this is a subsequence of the other argument
     * @param other
     *            the string to check against.
     * @return a boolean if check is a subsequence of other
     */
    public static boolean isSubsequence(String check, String against) {
        boolean result = false;

        // ADD CODE HERE TO CHECK IF WE HAVE A SUBSEQUENCE
        return result;
    }
}
