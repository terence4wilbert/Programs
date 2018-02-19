import java.util.Arrays;

public class bubbleSort{
    public static void bubbleSort1(int[] numArray){
        int n = numArray.length;
        int temp = 0;
        int totalLoops = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= (n - 1); j++){
                if(numArray[j-1] > numArray[j]){
                    temp = numArray[j - 1];
                    numArray[j-1] = numArray[j];
                    numArray[j] = temp;
                    totalLoops += 1;
                }
            }
        }
        System.out.println(totalLoops);
    }


    public static void main(String[] args){
        int [] newArray = {2,4,5,8,5,3,9,12,6,1,8};
        //bubbleSort test = new bubbleSort();
        bubbleSort1(newArray);
        System.out.println(Arrays.toString(newArray));        
    }
}