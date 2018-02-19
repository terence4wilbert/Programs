import java.util.*;
public class permutations{
    String sort(String s){
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    boolean permutation(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }


    public boolean permutation2(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }


    public static void main(String[] args){
        permutations testPerm = new permutations();
        System.out.println(testPerm.permutation("dog", "god"));
        System.out.println(testPerm.permutation2("hi", "ih"));
    }
}