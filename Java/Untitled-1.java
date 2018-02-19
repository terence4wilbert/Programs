public class permutations{
    String sort(String s){
        char[] content = s.toCharArray();
        Java.util.Arrays.sort(content);
        return new String(content);
    }

    boolean permutation(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
    }


    public boolean permutation2(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }

        char[] a = sort.str1.toCharArray();
        char[] b = sort.str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
}