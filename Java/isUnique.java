public class isUnique{
    boolean isUnique(String str){
    if (str.length() > 128)
        return false;

    boolean[] char_set = new boolean[128];
    for(int i = 0; i < str.length(); i++){
        int val = str.charAt(i);
        if(char_set[val])
            return false;
        char_set[val] = true;
    }
    return true;
}



    public static void main(String[] args){
        System.out.println("Cracking coding interview Problem 1:");
        System.out.println('\n');

        isUnique test1 = new isUnique();
        test1.isUnique("Mables");
        System.out.println("The test of the word Mables = " + test1.isUnique("Mables"));
        System.out.println("The test of the word Hazzy = " + test1.isUnique("Hazzy"));
    }
}
