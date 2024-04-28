import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Represents a button that navigates to the start screen when clicked.
 * 
 * Inherits from the Actor class and overrides the act method to define the behavior when clicked.
 * 
 * When clicked, the button changes the world to the StartScreen if it's in the game world.
 * If not in the game world, it displays a warning screen before navigating to the StartScreen.
 * 
 * The button is typically represented by an image of a home icon.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class homeButton extends Actor
{
    private boolean inStartScreen = true; // Indicates if currently in the start screen
    
    /**
     * Constructor for creating a homeButton.
     * Initializes the button with default settings.
     */
    public homeButton(){
        // Additional initialization can be added here if needed
    }
    
    /**
     * Method called when the homeButton is clicked.
     * Changes the world to the StartScreen if in the game world.
     * Displays a warning screen and then navigates to the StartScreen if not in the game world.
     */
    public void act() {
        setImage("castle.png"); // Set the image of the button to a home icon
        
        // Check if the button is clicked
        if (Greenfoot.mouseClicked(this)) {
            // If currently in the game world, navigate to the StartScreen directly
            if (inStartScreen)  {
                Greenfoot.setWorld(new StartScreen()); 
            } else {
                // If not in the game world, display a warning screen before navigating to the StartScreen
                GameWorld currentGameWorld = (GameWorld)getWorld();
                Greenfoot.setWorld(new warningScreen(currentGameWorld));
            }
        }
    }

}
