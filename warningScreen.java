import greenfoot.*;

/**
 * Represents a warning screen that prompts the user to confirm an action.
 * 
 * This class extends the World class and initializes the warning screen with appropriate objects.
 * It contains a reference to the currentGameWorld, allowing the user to return to the previous game world if needed.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class warningScreen extends World
{
    public GameWorld currentGameWorld; // Reference to the current game world
    
    /**
     * Constructor for creating a warningScreen.
     * 
     * @param currentGameWorld The current game world from which the warning screen is triggered.
     */
    public warningScreen(GameWorld currentGameWorld)
    {    
        // Create a new world with appropriate dimensions
        super(1100, 800, 1); 
        
        // Initialize the reference to the current game world
        this.currentGameWorld = currentGameWorld;
        
        // Set the background of the warning screen
        setBackground("recycpap.jpg");
        
        // Add objects to the warning screen
        addObject(new warningText(), getWidth() / 2 , getHeight() / 2 - 200);
        addObject(new yesButton(), getWidth() / 2 - 200 , getHeight() / 2 + 100);
        addObject(new noButton(), getWidth() / 2 + 200 , getHeight() / 2 + 100);
    }
        
}
