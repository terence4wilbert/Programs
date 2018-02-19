public class immutable{
    public final class Student{
        private final String name;
        private final String age;

        public Student(String name, String age){
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return name;
        }

        public String getAge(){
            return age;
        }
    }
}