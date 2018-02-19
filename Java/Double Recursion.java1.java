/**
 * Use a double recursion to compute the maximum of an array of values.
 * 
 * @author H. Paul Haiduk
 * @author Terence Wilbert
 * @version 3.0
 */
public class RecursiveMaxOfArray {
  
    /**
     * compute the maximum of a range of values in an array recursively
     *
     * @param  data   an array of integers
     * @param from  the first index for the maximum
     * @param to    the second index for the maximum
     * 
     * preconditions: from <= to, from >=0, to<length, length>0
     *                
     * @return     the maximum value in the array
     */
    
    private static boolean debugEnabled = false;
    private static int stackSize = 0;
    
    private static void debugOut(String mesg) {
        if (!debugEnabled) return;
        for (int i = 0; i < stackSize; i++){
            System.out.print("=");
        }
        System.out.println(">" + mesg);
        }
    
    public int max(int[] data, int from, int to) throws BadArgumentsForMaxException {
        int rangeSize;
        int value1;
        int value2;
        
        stackSize++;
        
        debugOut("Entering method max(data, " + String.valueOf(from) + ", " + String.valueOf(to) +")");
        
        rangeSize = to - from + 1;
        
        if (data == null || data.length < 1 || to < from) {
            throw new BadArgumentsForMaxException("Null array or empty range");
        }
        if (from < 0) {
            throw new BadArgumentsForMaxException("Array index out of bounds");
        }
        if (to > data.length - 1) {
            throw new BadArgumentsForMaxException("Array index out of bounds");
        }
        
        if (rangeSize == 1) {
            debugOut("Single value: " + String.valueOf(data[from]));
            stackSize--;
            return data[from];
        }
        if (rangeSize == 2){
            debugOut("Comparing " + String.valueOf(data[from]) + " and " + String.valueOf(data[to]));
            if (data[from] > data[to]) {
                debugOut("Leaving method max; Return: " + String.valueOf(data[from]));
                stackSize--;
                return data[from];
            }
            debugOut("Leaving method max; Return: " + String.valueOf(data[to]));
            stackSize--;
            return data[to];
        }
        if (rangeSize % 2 == 0) {
            debugOut("Recurssive comparison: data[" + String.valueOf(from) + ".." + String.valueOf(to - (rangeSize /2)) + "] and data[" + String.valueOf(from + (rangeSize / 2)) + ".." + String.valueOf(to) + "]");
            value1 = max(data, from, to - (rangeSize /2));
            value2 = max(data, from + (rangeSize / 2), to);
        } else {
            debugOut("Recursive comparison: data[" + String.valueOf(from) + ".." + String.valueOf(to - (rangeSize / 2)) + "] and data[" + String.valueOf(from + (rangeSize / 2) + 1) + ".." + String.valueOf(to) + "]");
            value1 = max(data, from, to - (rangeSize / 2));
            value2 = max(data, from + (rangeSize / 2) + 1, to);
        }    
        if (value1 > value2){
            debugOut("Leaving method max; Return: " + String.valueOf(value1));
            stackSize--;
            return value1;
        }
        debugOut("Leaving method max; Return: " + String.valueOf(value2));
        stackSize--;
        return value2;
    }
}
            
            
        

    