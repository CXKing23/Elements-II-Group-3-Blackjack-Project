/**
 * Write a description of class Suit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public enum Suit
{
    EARTH(0,"\uD83E\uDEA8"), WATER(1, "\uD83C\uDF0A"),
    FIRE(2, "\uD83D\uDD25"), NATURE(3, "\uD83C\uDF43"), SPECIAL(4, "Special");


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
