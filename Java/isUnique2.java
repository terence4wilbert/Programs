// Using a bit vector
// assuming only a-z lowercae is used
public class isUnique2 {
    boolean isUnique2(String str){
        int checker = 0;
        for (int i = 0; i < str.length(); i++){
            int val = str.charAt(i) - 'a';
            System.out.println("Val for character str.charAt(i) = " + str.charAt(i) + ", [VAL] = ");
            if ((checker & (i << val)) > 0){
                return false;
            } 
            checker |=(i << val);
        }
        return true;
    }


    public static void main(String[] args){
        System.out.println("Problem 2: Unique characters");
        isUnique2 test2 = new isUnique2();
        System.out.println("The test for test 2 an word lazz = " + test2.isUnique2("lazz"));
        System.out.println("The test for test 2 an word stringy = " + test2.isUnique2("stringy"));
    }
}