public class test {

    public static String classVariable = "I am associated with the class";
    public String instanceVariable = "I am associated with the instance";

    public void setText(String string){
        this.instanceVariable = string;
    }

    public static void setClassText(String string){
        classVariable = string;
    }

    public static void main(String[] args){
        Test test1 = new Test();
        Test test2 = new Test();

        // Change test1's instance variable
        test1.setText("Changed");
        System.out.println(test1.instanceVariable); // will print changed
        // test2 is unaffected
        System.out.println(test2.instanceVariable); // will print "I am associated with the instance"
    }
}