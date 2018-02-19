public class SinglyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public void add(T element){
        Node<T> nd = new Node<T>();
        nd.setValue(element);
        System.out.println("Adding: " + element);

        /**
         * check if the list is empty
         */
        if(head == null){
            /**
             * since there is only one element, both head and
             * tail point to the same object
             */
            head = nd;
            tail = nd;
        } else {
            /**
             * set current tail next link to new node
             */
            tail.setNextRef(nd);
            // set tail as newly created node
            tail = nd;
        }
    }

    public void addAfter(T element, T after){
        Node<T> tmp = head;
        Node<T> refNode = null;
        System.out.println("Traversing to all nodes..");
        /**
         * Traverse till given element
         */

         while(true){
             if(tmp == null){
                 break;
             }
            if(tmp.compareTo(after) == 0){
                // found the target node, add after this node
                refNode = tmp;
                break;
            }
            tmp = tmp.getNextRef();
         }
        if(refNode != null){
            // add element after the target node
            Node<T> nd = new Node<T>();
            nd.setValue(element);
            nd.setNextRef(tmp.getNextRef());
            if(tmp = tail){
                tail = nd;
            }
            tmp.setNextRef(nd);
        } else {
            System.out.println("Unable to find the given element...");
        }
    }

    public static void main(String[] args){

    }
}

class Node<T> implements Comparable<T> {
    private T value;
    private Node<T> nextRef;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public Node<T> getNextRef(){
        return nextRef;
    }

    public void setNextRef(Node<T> ref){
        this.nextRef = ref;
    }

    public int compareTo(T arg){
        if (arg == this.value){
            return 0;
        } else{
            return 1;
        }
    }
}