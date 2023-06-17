public class Card implements Comparable<Card> {
    private String suit;
    private int rank;
    private String color; //red or black

    //spades, clubs, hearts, diamonds


    public Card(String suit, int rank){
        this.rank = rank;
        this.suit = suit;
        //Sets color of card
        if(this.suit.compareToIgnoreCase("diamonds")==0 || this.suit.compareToIgnoreCase("hearts")==0){
            this.color ="red";
        }
        else {
            this.color = "black";
        }
    }//Card

    public String getSuit(){
        return this.suit;
    }

    public int getRank(){
        return this.rank;
    }

    public String getColor(){
        return this.color;
    }



    @Override
    public String toString() {
        String suit = this.suit;
//        switch (this.suit){
//            case "spades":
//                suit ="♠";
//                break;
//            case "clubs":
//                suit = "♣";
//                break;
//            case "hearts":
//                suit = "♥";
//                break;
//            case "diamonds":
//                suit = "♦";
//                break;
//            default:
//                suit = this.suit;
//        }
        return suit + " "+ this.rank;
    }

    @Override
    public int compareTo(Card o) {
        if(this.rank < o.getRank())
            return -1;
        else if(this.rank > o.getRank())
            return 1;
        return 0;
    }
}
