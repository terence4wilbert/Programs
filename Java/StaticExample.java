public class StaticExample{
   StaticDeclaration.setTestValue(5);

    // non-private static variable can be access with class name 
    StaticDeclaration.testString = "\n Assigning testString a value";
    StaticDeclaration csd = new StaticDeclaration();
    System.out.println(csd.getTestString());

    // class and instance static variable are same
    System.out.print("\nCheck if Class and Instance Static Variable are same:  ");
    System.out.println(StaticDeclaration.testString == csd.testString);
    System.out.println("Why? Because StaticDeclaration.testString == csd.testString");
}
