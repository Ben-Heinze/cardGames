import java.util.ArrayList;
import java.util.Random;
public class Deck {
    private String[] suits = {"clubs", "spades", "hearts", "diamonds"};
    private SinglyLinkedList deck;
    //♣♦♥♠
    //spades, diamonds, hearts, clubs

    /**
     * Constructs a proper deck with a dynamic linked list
     * @return
     */
    public Deck(){
        SinglyLinkedList<Card> deck = new SinglyLinkedList();
        for(String suit : suits){
            //jack=11,queen=12,king=13,ace=14
            for(int rank=2; rank<15;rank++){
                Card card = new Card(suit,rank);
                deck.append(card);
            }
        }
        this.deck = deck;
    }

    public SinglyLinkedList getDeck() {
        return this.deck;
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
    /*
    public void shuffle(){
        SinglyLinkedList<Card> newDeck = new SinglyLinkedList();
        int size = this.deck.getSize();
        if(size<=1){ return;}
        //1
        Card[] oldDeck = new Card[size];
        boolean[] chosen = new boolean[size];
        //2
        int count=0;
        while(this.deck.getSize()>0){
            oldDeck[count++] = (Card) this.deck.remove();
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
        this.deck = newDeck;
    }
    */

    public int getSize(){ return this.deck.getSize();}
    public void print(){ this.deck.print();}


}
