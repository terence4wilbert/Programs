public class StaticMethodMain{
    public static void main(String[] arg){
        String[] crunchifyObject = new String[3];
        crunchifyObject = new String[] {"Google", "Facebook", "Crunchify"};

        // create instance
        StaticMethodMain object = new StaticMethodMain();
        object.TestMethod(crunchifyObject);
    }


	/*
	 * Check this out: Let's understand little more...
	 * 
	 * Here method crunchifyTestMethod is defined as 
	 * public void crunchifyTestMethod(String[]) 
	 * so it is "non-static". It can't be called unless it is called on an instance of CrunchifyStaticMethodMain.
	 * 
	 * If you declared your method as 
	 * public static void crunchifyTestMethod(int[]) 
	 * then you could call: CrunchifyStaticMethodMain.crunchifyTestMethod(arr); within main without having created an instance for it.
	 */
    
    public void TestMethod(String[] crunchifyObject){
        for(int i = 0; i < crunchifyObject.length; i++){
            System.out.println(crunchifyObject[i]);
        }
    }
}