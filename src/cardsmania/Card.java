
package cardsmania;

import java.io.Serializable;

public class Card implements Serializable{

    private Suit suit;
    private Face face;
    private String spritePath;
    
    public Card() {}
    public Card(Suit s, Face f) {
        this.suit = s;
        this.face = f;
        this.spritePath = "/cardsmania/pics/" + s.getSuitName() + "/" + f.getFaceName() + ".png";
    }
    
    public Suit getSuit() {
        return this.suit;
    }

    public String suitName() {
        return this.suit.getSuitName();
    }
    
    public Face getFace() {
        return this.face;
    }
    
    public int faceValue() {
        return this.face.getFaceValue();
    }
    
    public int suitValue() {
        return this.suit.getSuitValue();
    }
    
    public String getCardName() {
        return this.suit.getSuitName() + " ko " + this.face.getFaceName();
    }
    
    public String getSpritePath() {
        return this.spritePath;
    }
    
}
