import java.util.Random;

/**
 * This is a dynamic stack of cards.
 */
public class cardStack{
    private SinglyLinkedList<Card> stack;

    public cardStack(){
        this.stack = new SinglyLinkedList();
    }

    public cardStack(boolean fullDeck){
        this.stack = new Deck().getDeck();
    }

    public void push(Card c){
        this.stack.append(c);
    }
    public Card pop(){
        return this.stack.remove();
    }
    /**
     * Shuffles the Linked List of cards. It will create a temp array
     * with the #-of-cards' size then randomly chooses a card from the array
     * without duplicates until there is a new
     *
     * 1) create arrays
     * 2) fill arrays (bool w/ false and card[] with LL cards)
     *
     */
    public void shuffle(){
        SinglyLinkedList<Card> newDeck = new SinglyLinkedList();
        int size = this.stack.getSize();
        if(size<=1){ return;}
        //1
        Card[] oldDeck = new Card[size];
        boolean[] chosen = new boolean[size];
        //2
        int count=0;
        while(this.stack.getSize()>0){
            oldDeck[count++] = (Card) this.stack.remove();
        }
        for(boolean b : chosen){ b = false;}
        //3
        Random rand = new Random();
        int number = rand.nextInt(size);
        for(int i=0;i<size;i++){
            while(chosen[number] != false){
                number = rand.nextInt(size);
            }
            newDeck.append(oldDeck[number]);
            chosen[number]= true;
        }
        this.stack = newDeck;
    }

    public void print(){
        this.stack.print();
    }

    public void contains(int rank){
        for(int i=0;i<this.stack.getSize();i++){

        }
    }

    //TODO contains suit

    //TODO contains card
    public int getSize(){
        return this.stack.getSize();
    }
}
