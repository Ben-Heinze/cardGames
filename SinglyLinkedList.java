import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.ToDoubleBiFunction;

public class SinglyLinkedList<G extends Comparable<G>>{

    private Node head;
    private int size;
    public SinglyLinkedList(){
        this.head = null;
        this.size =0;
    }

    /**
     * Adds item to the end of the linked list and adds to count
     * @param contents
     */
    public void append(G contents){
        //create new node
        Node node = new Node(contents);

        //if empty, set to head
        if(this.head==null){
            this.head = node;
        }
        //if not, find node before null then set next
        else{
            Node iter = this.head;
            while(iter.next!=null){
                iter = iter.next;
            }
            iter.next = node;
        }
        this.size++;
    }

    public Node getHead() {
        return head;
    }

    /**
     * Removes specified item in the linked list, if no item
     * is specified, it will remove the last item in the linked list
     * and return the item. Removes to count
     */
    //REMOVE(), REMOVE(item)
    public G remove(){
        //if head is empty, print error,
        //else if head is only item in list, set head to null
        if(this.head==null){
            System.out.println("Nothing to remove");
            return null;
        }else if(this.head.next==null){
            Node temp = this.head;
            this.head = null;
            this.size--;
            return (G) temp.contents;
        }
        Node iter = this.head.next;
        Node lag = this.head;
        //iter until it finds the last item in list
        while(iter.next !=null){
            iter = iter.next;
            lag = lag.next;
        }
        //stores data in temp node, and sets the lag's next to null
        Node temp = iter;
        lag.next = null;
        this.size--;
        return (G) temp.contents;

    }

    /**
     * Removes a specific item from the list
     * Does not return anything
     */
    //TODO : Finish this method make sure it derements count
    public void remove(G contents){
        if(exists(contents)==false){
            System.out.println("Item does not exist in list");
            return;
        }
    }

    /**
     * Checks if a specific value is in the linked list
     * @param contents
     * @return True if yes, False if the value does not exist in list
     */
    public boolean exists(G contents){
        if(this.head==null){
            return false;
        }
        Node iter = this.head;
        //Node compare = new Node(contents);
        do{
            if(iter.compareTo(contents)==0){
                return true;
            }
            iter = iter.next;

        }while(iter != null);

        return false;
    }

    /**
     * returns the amount of items in LL
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * Prints the contents of the Linked List
     */


    public void print(){
        String out = "";        //output
        //if empty, print empty list
        if(this.head==null){
            System.out.println("[]");
        }
        //if not empty, loop through every item and add to output string
        else {
            Node iter = this.head;
            while(iter != null) {
                out = out + "[" + iter.toString() + "]";
                //if this node is NOT the last in list, add an arrow
                if(iter.next !=null) {
                    out = out + " -> ";
                }
                iter = iter.next;
            }
            //prints output
            System.out.println(out);
        }
    }

    /**
     * Helper class for Linked list, Nodes act as containers
     * @param <T>
     */
    private class Node<T extends Comparable <T>>{
        private T contents;     //the contents of the node
        private Node next;      //the next node

        /**Constructs LL*/
        public Node(T contents){
            this.next = null;
            this.contents = contents;
        }

        public T getContents() {
            return this.contents;
        }



        /**
         * Prints the contents of the string
         * @return
         */
        @Override
        public String toString() {
            return this.contents.toString();
        }


        public int compareTo(T o) {
            //if it's less than, return -1
            if(this.contents.compareTo(o) < 0){
                return -1;
            }
            //if it's greater than, return 1
            else if(this.contents.compareTo(o) > 0){
                return 1;
            }
            //if it's equal, return 0
            else{
                return 0;
            }
        }
    } //Node class

}

