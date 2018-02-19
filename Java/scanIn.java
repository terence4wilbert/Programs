import java.util.*;
import java.io.*;

public class scanIn {


    public int countItUp(int n){
        int man = 0;
        for (int i = 0; i < n; i++){
            man += i;
        }
        return man;
    }


    public static void main(String[] args){
        System.out.print("This is where input will go: ");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        scanIn scans = new scanIn();
        int whatsCount = scans.countItUp(4);
        System.out.println("WhatsCount: " + whatsCount);
        // System.out.println("Inputted Int: " + t);
        for(int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j = 0; j < n; j++){
                a = a + (int)Math.pow(2,j)*b;
                System.out.print(a + " ");
            }
            System.out.println("");
        }
        in.close();
    }
}