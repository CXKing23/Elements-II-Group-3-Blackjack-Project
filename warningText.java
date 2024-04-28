import greenfoot.*;

/**
 * Represents a text display for a warning message.
 * 
 * This class extends the Actor class and displays a warning message.
 * It scales and sets the image of the warning text.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class warningText extends Actor
{
    /**
     * Defines the action to be performed by the warningText.
     * This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Create a GreenfootImage for the warning text
        GreenfootImage image = new GreenfootImage( "Are you sure you want to exit? Any progress made will be lost.", 100, Color.BLACK, new Color(0, 0, 0, 0));

        // Scale the image to fit the screen
        image.scale(1000, 100);
        
        // Set the image of the warning text
        setImage(image);
    }
}
