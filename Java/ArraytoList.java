import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class ArraytoList {
    public static void main(String[] arg) {
        String sArray[] = new String[] {"Array 1", "Array 2", "Array 3"};

        // convert array to list
        List<String> lList = Arrays.asList(sArray);

        // iterator loop
        System.out.println("#1 iterator");
        Iterator<String> iterator = lList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        // for loop
        System.out.println("#2 for");
        for(int i = 0; i < lList.size(); i++){
            System.out.println(lList.get(i));
        }
        System.out.println();

        // for loop advance
        System.out.println("#3 for advanced");
        for (String temp : lList){
            System.out.println(temp);
        }
        System.out.println();

        // while loop
        System.out.println("#4 while");
        int j = 0;
        while (j < lList.size()){
            System.out.println(lList.get(j));
            j++;
        }
    }
}