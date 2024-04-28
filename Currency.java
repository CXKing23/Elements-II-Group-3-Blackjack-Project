import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class representing the Currency display in the game.
 * This class manages the current balance and bet balance, displaying them on the screen.
 * 
 * It includes methods for setting and getting the balance, as well as updating the display image.
 * 
 * It retrieves the balance from the `bronzeChip` class, assuming it has appropriate methods for accessing the balance and bet balance.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class Currency extends Actor
{
    static int currentBalance;
    static int betBalance; 
    static final int startingBalance = 1000;
    GreenfootImage image; 
    
    /**
     * Constructor for creating a Currency object.
     * Initializes the current balance and bet balance from the `bronzeChip` class and sets the display image.
     */
    public Currency()
    {
        currentBalance = bronzeChip.getBalance();
        betBalance = bronzeChip.getbetBalance();
        setImage(image);
    }
    
    /**
     * Sets the current balance to the specified value.
     * 
     * @param newBalance The new balance to set.
     */
    public void setBalance(int newBalance){
        currentBalance = newBalance;
    }
   
    /**
     * Gets the current balance.
     * 
     * @return The current balance.
     */
    public int getBalance() {
        return currentBalance;
    }
    
    /**
     * Act method to update the display image with the current balance and bet balance.
     */
    public void act(){
        // Update the image with the current balance and bet balance
        image = new GreenfootImage("Balance: " + bronzeChip.getBalance() + "\n" + "Bet: " + bronzeChip.getbetBalance(), 24, Color.BLACK, new Color(0, 0, 0, 0));
        setImage(image);
    }
}
