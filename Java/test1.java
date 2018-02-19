class test1{
    int i = 40;
    int j;

    public test1(){
        setValue(i++);
    }

    void setValue(int inputValue){
        int i = 20;
        j = i + 1;
        System.out.println("j = " + j);
    }


    public static void main(String[] arg){
        test1 test = new test1();
        //System.out.println(test);
    }
}