import java.util.Iterator;

public class withG {
    public static void main(String[] arg) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Chaitanya");
        names.add("Steve");
        names.add("Jack");

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            String obj = it.next();
            System.out.println(obj);
        }
    }
}