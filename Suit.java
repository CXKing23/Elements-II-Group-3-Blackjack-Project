/**
 * Write a description of class Suit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum Suit  
{
    CLUB(0,"\u2663"), SPADE(1, "\u2660"),
    HEART(2, "\u2665"), DIAMOND(3, "\u2666");

    private int value;
    private String rep;

    Suit(int value, String representation){
        this.value = value;
        rep = representation;
    }
    
    public int getValue(){
	return value;
    }
    
    public String toString(){
        return rep;
    }

}
