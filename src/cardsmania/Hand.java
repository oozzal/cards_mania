
package cardsmania;

import java.io.Serializable;

public class Hand implements Serializable {
    
    public Card[] handCards;
    private int TRIAL = 5;
    private int DOUBLE_RUN = 4;
    private int RUN = 3;
    private int COLOR = 2;
    private int JOOT = 1;
    private int HIGH_CARD = 0;
    private int handValue;
    public String handType;
    private String[] handTypes = {"High Card","Joot","Color","Run","Double Run","Trial"};
    
    public Hand() {}
    
    public void getHandCards() {
        for(int i=0; i < this.handCards.length; i++) {
            System.out.println(this.handCards[i].getCardName());
        }
    }
    
    private void sortHandCards() {
        int i,j;
        Card temp;
        for(i = this.handCards.length - 2; i >= 0; i--) {
            for(j = 0; j <= i; j++) {
                if(this.handCards[j].faceValue() > this.handCards[j+1].faceValue()) {
                    temp = this.handCards[j]; 
                    this.handCards[j] = this.handCards[j+1];  
                    this.handCards[j+1] = temp;  
                }
            }
        }
   }
    
    public void arrange() {
        this.sortHandCards();
        this.findHandValue();
        this.findHandType();
    }
    
    private void findHandType() {
        this.handType = handTypes[this.handValue];
    }
    
    private void findHandValue() {
        if(this.isTrial()) this.handValue = TRIAL;
        else if(this.isDoubleRun()) this.handValue = DOUBLE_RUN;
        else if(this.isRun()) this.handValue = RUN;
        else if(this.isColor()) this.handValue = COLOR;
        else if(this.isJoot()) this.handValue = JOOT;
        else this.handValue = HIGH_CARD;
    }
    
    public boolean isGreaterHand(Hand h) {
        if(this.handValue > h.handValue)
            return true;
        if(this.handValue == h.handValue) {
            switch(this.handValue) {
                case 5://TRIAL
                case 4://DOUBLE_RUN
                case 3://RUN
                    if(this.handCards[0].faceValue() > h.handCards[0].faceValue())
                        return true;
                    else return false;
                case 2://COLOR
                case 0://HIGH_CARD
                    if(this.handCards[2].faceValue() > h.handCards[2].faceValue())
                        return true;
                    else if(this.handCards[2].faceValue() == h.handCards[2].faceValue()) {
                        if(this.handCards[1].faceValue() > h.handCards[1].faceValue())
                            return true;
                        else if(this.handCards[1].faceValue() == h.handCards[1].faceValue()) {
                            if(this.handCards[0].faceValue() > h.handCards[0].faceValue())
                                return true;
                            else return false;
                        }
                    }
                    return false;
                case 1://JOOT
                    if(this.handCards[1].faceValue() > h.handCards[1].faceValue())
                        return true;
                    else if(this.handCards[1].faceValue() == h.handCards[1].faceValue()) {
                        if(this.handCards[0].faceValue() > h.handCards[0].faceValue()
                                || this.handCards[2].faceValue() > h.handCards[2].faceValue())
                            return true;
                        else return false;
                    }
                    return false;
                default:
                    return false;
            }
        }
        return false;
    }
    
    public boolean isEqualHand(Hand h) {
        if(!this.isGreaterHand(h) && !h.isGreaterHand(this))
            return true;
        else return false;
    }
    
    private boolean isTrial() {
        if(this.handCards[0].faceValue() == this.handCards[1].faceValue() 
                && this.handCards[0].faceValue() == this.handCards[2].faceValue())
            return true;
        return false;
    }

    private boolean isDoubleRun() {
        if(this.isRun() && this.isColor()) 
            return true;
        return false;
    }
    
    private boolean isRun() {
        if( (this.handCards[2].faceValue() - this.handCards[1].faceValue()) == 1 
                && (this.handCards[1].faceValue() -this.handCards[0].faceValue()) == 1 ) 
            return true;
        return false;
    }
    
    private boolean isColor() {
        if(this.handCards[0].suitName() == this.handCards[1].suitName()
                && this.handCards[0].suitName() == this.handCards[2].suitName()) 
            return true;
        return false;
    }
    
    private boolean isJoot() {
        if(this.handCards[0].faceValue() == this.handCards[1].faceValue()
                || this.handCards[0].faceValue() == this.handCards[2].faceValue()
                || this.handCards[1].faceValue() == this.handCards[2].faceValue()) 
            return true;
        return false;
    }
    
    private boolean isHighCard() {
        if(!this.isTrial() || !this.isDoubleRun() || !this.isRun() 
                || !this.isColor() || !this.isJoot()) 
            return true;
        return false;
    }
    
}
