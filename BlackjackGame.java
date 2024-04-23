import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class that represents a Blackjack game.
 * This class extends CardGame and implements a basic Blackjack game logic.
 * Players can join the game, leave the game, and the dealer can deal cards.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class BlackjackGame extends CardGame
{
    private BlackjackHand[] hands; // Array to store player hands
    private BlackjackHand dealer;  // Dealer's hand
    private int numberOfHands;      // Number of players in the game
    
    /**
     * Constructor for BlackjackGame.
     * 
     * @param numberOfDecks The number of decks to be used in the game.
     * @param maxNumberOfHands The maximum number of players allowed in the game.
     */
    public BlackjackGame(int numberOfDecks, int maxNumberOfHands)
    {
        super(numberOfDecks);                        // Call the constructor of the superclass
        hands = new BlackjackHand[maxNumberOfHands]; // Initialize the array for player hands
        dealer = new BlackjackHand("Dealer");        // Initialize the dealer's hand
        numberOfHands = 0;                           // Initialize the number of players
    }
    
    /**
     * Method to add a player to the game.
     * 
     * @param name The name of the player to be added.
     */
    public void join(String name)
    {
        // Check if there's space for another player
        if (numberOfHands < hands.length){
            hands[numberOfHands] = new BlackjackHand(name); // Create a new player hand
            numberOfHands++;                                // Increment the number of players
        }
    }
    
    /**
     * Method to remove a player from the game.
     * 
     * @param name The name of the player to be removed.
     */
    public void leave(String name)
    {
        boolean isFound = false; // Flag to track if the player is found
        
        // Iterate through the player hands array
        for(int index=0; index < numberOfHands; index++){
            if (!isFound){
                // Check if the current hand is the one to be removed
                if (hands[index].getName().equals(name)){
                    isFound = true; // Set the flag to true
                } 
            } else {
                // Shift the remaining player hands to fill the gap
                hands[index-1] = hands[index];
            }
        }
        
        // If the player was found, decrement the number of players and nullify the last element
        if (isFound) {
            numberOfHands--;
            hands[numberOfHands] = null;
        }
    }
    
    /**
     * Method to perform the initial dealing of cards.
     * 
     * This method is not implemented yet.
     */
    public void deal(){
        // Implement your code here
    }
    
    /**
     * Act method.
     * This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
