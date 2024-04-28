import greenfoot.*;

/**
 * Represents a button to confirm a "Yes" action for WarningScreen.
 * 
 * This class extends the button class and overrides the onClick method to define the behavior when clicked.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class yesButton extends button
{
    /**
     * Constructor for creating a yesButton.
     * Initializes the button with the default appearance and text.
     */
    public yesButton()
    {
        // Create the button image with default appearance and text
        image = new GreenfootImage("activeButton.png");
        image.scale(170, 80);
        setImage(image);
        image.setColor(Color.BLACK);
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Yes", 60, 48);
    }
    
    /**
     * Method called when the yesButton is clicked.
     * Changes the appearance of the button when clicked and triggers an action to return to the StartScreen.
     */
    public void onClick() {
        // Change button appearance
        image = new GreenfootImage("redButton.png");
        image.scale(170, 80);
        setImage(image);
        image.setColor(Color.BLACK);
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Yes", 60, 48);
        
        // Delay to show button click effect
        Greenfoot.delay(duration);
        
        // Reset button appearance
        GreenfootImage image = new GreenfootImage("activeButton.png");
        image.scale(170, 80);
        setImage(image);
        image.setColor(Color.BLACK);
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Yes", 60, 48);
        
        // Switch to the StartScreen world
        Greenfoot.setWorld(new StartScreen());
    }
}
