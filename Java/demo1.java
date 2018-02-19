import static java.lang.System.out;

import java.util.Arrays;

import static java.lang.Math.*;

class demo1{

    public static void bubbleSort(int[] numArray){
        int n = numArray.length;
        int temp = 0;

        for (int i = 0; i < n; i++){
            for(int j=1; j <= (n - 1); j++){
                if (numArray[j - 1] > numArray[j]){
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        // double var1 = Math.sqrt(5.0);
        // double var2 = Math.tan(30);
        // System.out.println("Square of 5 is: " + var1);
        // System.out.println("Tan of 30 is: " + var2);

        // double var1 = sqrt(5.0);
        // double var2 = tan(30);

        // out.println("Square of 5 is: " + var1);
        // out.println("Tan of 30 is: " + var2);

        System.out.println("I am practicing");
        int[] newArray = {11, 33, 42, 88, 100, 1, 5};
        System.out.println("This is the original " + Arrays.toString(newArray));
        bubbleSort(newArray);
        System.out.println("Here goes it after sort" + Arrays.toString(newArray));

    }
}

class Node<T> implements Comparable<T> {
    private T value;
    private Node<T> nextRef;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public Node<T> getNextRef(){
        return nextRef;
    }

    public void setNextRef(Node<T> ref){
        this.nextRef = ref;
    }

    public int compareTo(T arg){
        if(arg == this.value){
            return 0;
        } else {
            return 1;
        }
    }
}