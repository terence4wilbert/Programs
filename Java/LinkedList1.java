class LinkedList1 {
    Node head;      // head of list

    /* Linked list Node. This inner class is made static so that main()
        can access it */
    
    static class Node {
        int data; 
        Node next; 
        Node(int d) { data = d; next = null;}  // Constructor
    }
    /* method to create a simple linked list with 3 nodes */
    public static void main(String[] args){

        /* Start with empty list. */
        LinkedList1 llist = new LinkedList1();
        

    }

}
