
package cardsmania;

import java.io.Serializable;

public class Suit implements Serializable {
    
    private String[] suitName = {"Vote", "Chidi", "Ita", "Paane"};
    private int suitValue;
    
    public Suit(int value) {
        this.suitValue = value;
    }    

    public int getSuitValue() {
        return this.suitValue;
    }
    
    public String getSuitName() {
        return suitName[this.suitValue];
    }
    
}
