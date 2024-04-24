import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Abstract class representing a generic card game.
 * Subclasses of this class can implement specific card games by providing their own rules.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public abstract class CardGame extends Actor
{
    private int numberOfDecks; // Number of decks used in the game
    private Deck gameDeck;     // Deck of cards for the game

    /**
     * Constructor for CardGame class.
     * Initializes the number of decks and creates a new game.
     * 
     * @param numberOfDecks The number of decks to be used in the game.
     */
    public CardGame(int numberOfDecks){
        this.numberOfDecks = numberOfDecks; // Set the number of decks
        newGame();                          // Create a new game
    }

    /**
     * Method to get the deck of cards for the game.
     * 
     * @return The deck of cards for the game.
     */
    protected Deck getGameDeck(){
        return gameDeck;
    }

    /**
     * Method to start a new game.
     * Creates a new deck of cards and shuffles it.
     */
    public void newGame(){
        gameDeck = new Deck(numberOfDecks); // Create a new deck with the specified number of decks
        gameDeck.shuffle();                 // Shuffle the deck
    }
    
    /**
     * Act method.
     * This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //
    }
}
