import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Represents a button for choosing "No" in a dialog or confirmation screen.
 * 
 * Inherits from the button class and overrides the onClick method to define the behavior when clicked.
 * 
 * When clicked, the button changes its appearance briefly and triggers an action.
 * Typically used in confirmation dialogs or warning screens.
 * 
 * The button is typically represented by an image of a button with the text "No".
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class noButton extends button
{
    /**
     * Constructor for creating a noButton.
     * Initializes the button with default appearance and text.
     */
    public noButton()
    {
        // Set the default appearance and text of the button
        image = new GreenfootImage("activeButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK);
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("No", 70, 48);
    }

    /**
     * Method called when the noButton is clicked.
     * Changes the appearance of the button briefly and triggers an action.
     * Navigates back to the previous screen (typically the game world) from the current warning screen.
     */
    public void onClick() {
        // Change button appearance briefly
        image = new GreenfootImage("redButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK);
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("No", 70, 48);
        
        Greenfoot.delay(duration); // Brief delay to show the button click effect
        
        // Restore the original button appearance
        GreenfootImage image = new GreenfootImage("activeButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK);
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("No", 70, 48);
        
        // Trigger the action: navigate back to the previous screen (typically the game world)
        warningScreen currentWarningScreen = (warningScreen)getWorld();
        Greenfoot.setWorld(currentWarningScreen.currentGameWorld);
    }
}
