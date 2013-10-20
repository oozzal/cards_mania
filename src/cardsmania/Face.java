
package cardsmania;

import java.io.Serializable;

public class Face implements Serializable {

    private String[] faceName = {
        "Dukka","Tikka","Chauka","Panja","Chhakka","Satta",
        "Attha","Nahal","Dahal","Guhlam","Missi","Badshah","Ekka"
    };
    private int faceValue;
    
    public Face(int value) {
        this.faceValue = value;
    }
    
    public int getFaceValue() {
        return this.faceValue;
    }
    
    public String getFaceName() {
        return faceName[this.faceValue];
    }
    
}
