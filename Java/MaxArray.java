import java.util.Arrays;

public class MaxArray {
    public static void main(String[] arg) {
        int [] ints = {11,12,4,56,8,10};
        int minVal = Integer.MAX_VALUE;

        for(int i = 0; i < ints.length; i++) {
            System.out.println("Comparing: int[i]: " + ints[i] + " minVal: " + minVal);
            if(ints[i] < minVal){
                minVal = ints[i];
            }
        }
        
        System.out.println("minVal = " + minVal);
        System.out.println();

        int[] ints2 = new int[10];

        for(int i = 0; i < ints2.length; i++){
            ints2[i] = 10 - i;
        }

        System.out.println(Arrays.toString(ints2));
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints2));
    }
}