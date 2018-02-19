class Block{
    static int i;
    int j;

    // start of static block
    static {
        i = 10;
        System.out.println("static block called");
    }
    // end of static block

}

class staticBlock {
    public static void main(String[] arg){

        System.out.println(Block.i);
        //System.out.println(Block.j);
    }
}