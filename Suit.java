/**
 * An enumeration representing the suits of a standard deck of cards.
 * 
 * Each suit has an associated integer value and a Unicode representation.
 * The integer value provides a unique identifier for each suit, and the
 * Unicode representation is a visual symbol representing the suit.
 * 
 * The available suits are:
 * - EARTH: Represents the Earth suit, symbolized by 🚨.
 * - WATER: Represents the Water suit, symbolized by 🌊.
 * - FIRE: Represents the Fire suit, symbolized by 🔥.
 * - NATURE: Represents the Nature suit, symbolized by 🍃.
 * - SPECIAL: Represents a special suit.
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

    /**
     * Constructs a new Suit enum constant with the specified integer value and representation.
     * 
     * @param value The integer value associated with the suit.
     * @param representation The Unicode representation of the suit.
     */
    Suit(int value, String representation){
        this.value = value;
        rep = representation;
    }

    /**
     * Returns the integer value associated with the suit.
     * 
     * @return The integer value of the suit.
     */
    public int getValue(){
        return value;
    }

    /**
     * Returns the Unicode representation of the suit.
     * 
     * @return The Unicode representation of the suit.
     */
    public String toString(){
        return rep;
    }
}
