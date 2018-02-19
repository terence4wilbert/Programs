class stack{
    private int maxSize;
    private long[] stackArray;
    private int top;

    // constructor
    public stack(int s){
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j){
        stackArray[++top] = j;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return(top == maxSize - 1);
    }

    public static void main(String[] args){
        stack theStack = new stack(10);

        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.peek();
        theStack.push(80);
        System.out.println("Here is the stack: ");
        while(!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.println(value);
        }
    } 
}