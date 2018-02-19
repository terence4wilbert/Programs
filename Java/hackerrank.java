import java.util.*;
import java.io.*;

class hackerrank{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        // System.out.println(t);
        for(int i = 0; i <t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            // System.out.println(a);
            // System.out.println(b);
            // System.out.println(n);

            for (int j = 0; j < n; j++){
                a = a + (int)Math.pow(2, j) * b;
                System.out.print(a + " ");
            }
            System.out.println("");
        }
        in.close();
    }
}