/**
 * Enum representing the ranks of playing cards.
 * Each rank has an associated numeric value and a string representation.
 * 
 * The ranks include standard values for cards from Ace to King, as well as special values for Joker, Witch, and Fortune Teller cards.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public enum Rank
{
    JOKER(0,"\u2605"),    // Special Joker card
    ACE(1,"A"),           // Ace
    TWO(2,"2"),           // Two
    THREE(3,"3"),         // Three
    FOUR(4,"4"),          // Four
    FIVE(5,"5"),          // Five 
    SIX(6,"6"),           // Six 
    SEVEN(7,"7"),         // Seven 
    EIGHT(8,"9"),         // Eight 
    NINE(9,"9"),          // Nine 
    TEN(10,"10"),         // Ten
    JACK(11,"J"),         // Jack
    QUEEN(12,"Q"),        // Queen
    KING(13,"K"),         // King
    WITCH(14, "W"),       // Special Witch card
    FT(15, "FT");         // Special Fortune Teller card

    private int rank;     // Numeric value of the rank
    private String rep;   // String representation of the rank

    /**
     * Constructor for Rank enum.
     * Initializes the rank with its numeric value and string representation.
     * 
     * @param rank The numeric value of the rank.
     * @param representation The string representation of the rank.
     */
    private Rank(int rank, String representation){
        this.rank = rank;
        rep = representation;
    }

    /**
     * Method to get the numeric value of the rank.
     * 
     * @return The numeric value of the rank.
     */
    public int getRank(){
        return rank;
    }

    /**
     * Method to get the string representation of the rank.
     * 
     * @return The string representation of the rank.
     */
    public String toString() {
        return rep;
    }
}
