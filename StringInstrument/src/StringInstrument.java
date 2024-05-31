/** An instance represents an instrument */
class MusicInstrument {
    private String name = null; //the instrument’s name
    /** Constructor: an instrument with name s */
    public MusicInstrument(String s) {
        name = s;
    }
}
/** An instance represents a string instrument with no name */

class StringInstrument extends MusicInstrument {
    private int numStrings; /** number of strings on this instrument */
    /** Constructor: an instrument with name s and num of strings*/
    public StringInstrument(String s, int numStrings){
        super(s);
        this.numStrings = numStrings;
    }
    /** Set the number of Strings on this instrument to n */
    public void setNumber(int n) {
        this.numStrings = n;
    }

}

class Guitar extends StringInstrument{
    private String type; //type of this instrument

    public Guitar(String s, int numStrings, String type){

    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType(String type) {
        return this.type;
    }
}


public class StringInstrument {
    public static void main(String[] args) {

    }
}

