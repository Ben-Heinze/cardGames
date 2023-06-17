import java.util.Scanner;

public class goFish {
    private cardStack deck;        //whole deck
    private cardStack user;        //user hand
    private cardStack bot;         //bot hand

    /**
     * Constructor
     * 1) creates a stack for everyone
     * 2) shuffles deck and distributes cards to bot and user
     */
    public goFish(){
        this.deck = new cardStack(true);
        this.user  = new cardStack();
        this.bot = new cardStack();
        this.deck.shuffle();
        this.deck.shuffle();
        //distributes
        for(int i=0;i<7;i++){
            user.push(deck.pop());
            bot.push(deck.pop());
        }
        System.out.println(this.deck.getSize());
        user.print();
        Scanner scan = new Scanner(System.in);

        while(deck.getSize()>0){
            int inp = scan.nextInt();

        }
    }


}
