
package cardsmania;

import java.io.Serializable;

public class Player implements Serializable {

    public Hand hand = null;
    public boolean isCurrentPlayer = false;
    public boolean seen = false;
    public boolean packed = false;
    public boolean canShow = false;
    public boolean canSideShow = false;
    public int totalAmount = 0;
    public int chaalAmount = 0;
    public int gameAmount = 0;
    
    public Player() {
        this.hand = new Hand();
    }
    
    public void getCards() {
        this.hand.getHandCards();
    }
    
}
