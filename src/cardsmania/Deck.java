
package cardsmania;

public class Deck {
    
    private Card[] deck;
    public int currentCardIndex = 0;
    
    public Deck() {
        this.deck = new Card[52];
        for(int i = 0; i < deck.length; i++) {
            this.deck[i] = new Card(new Suit(i / 13), new Face(i % 13));
        }
    }
    
    public Card getCardAt(int i) {
        return this.deck[i];
    }
    
    public void shuffle() {
        for(int i = 0; i < this.deck.length; i++) {
            int rand = (int)(Math.random() * 52);
            Card t = this.deck[i];
            this.deck[i] = this.deck[rand];
            this.deck[rand] = t;
        }
    }
    
    public void cutCards() {
        this.currentCardIndex = (int)(Math.random() * 51);
    }

    
}
