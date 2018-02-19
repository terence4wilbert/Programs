// immutable class practice 

public final class Person {
    private final String name;
    private final int age;
    private final Collection<String> friends;

    // constructor
    public Person(String name, int age, Collection<String> friends){
        this.name = name;
        this.age = age;
        this.friends = new ArrayList(friends);
    }

    public String getName(){
        return this.name;
    }

    public String getAge(){
        return this.age;
    }

    public Collection<String> getFriends(){
        return Collections.unmodifiableCollection(this.friends);
    }
}