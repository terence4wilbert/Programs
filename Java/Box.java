// Practice Generics

public class Box {
    private Object object;

    public void set(Object object){
        this.object = object;
    }

    public Object get() {
        return object;
    }
}

/**
 * Generics version of Box class.
 * @param <T> the type of the value being boxed.
 */

public class Box<T> {
    // T stands for "Type"
    private T t;
    public void set(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }
    
}