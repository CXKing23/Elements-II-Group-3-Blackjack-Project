import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Represents a button for accessing the settings screen in the game.
 * 
 * This class extends the button class and defines the behavior of the settingsButton.
 * When clicked, it switches the world to the setting screen by creating a new instance of settingScreen.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class settingsButton extends button
{
    GreenfootImage image = new GreenfootImage("activeButton.png");

    /**
     * Constructor for creating a settingsButton.
     * Initializes the button with the default appearance and text.
     */
    public settingsButton(){
        image.scale(170, 80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Setting", 45, 48);
    }
    
    /**
     * Defines the behavior of the settingsButton when clicked.
     * Switches the world to the setting screen.
     */
    public void onClick() {
        // Change the appearance of the button when clicked
        image = new GreenfootImage("redButton.png");
        image.scale(170, 80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Setting", 45, 48);
        
        // Add a delay to show the clicked state
        Greenfoot.delay(duration);
        
        // Restore the original appearance of the button
        image = new GreenfootImage("activeButton.png");
        image.scale(170, 80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Setting", 45, 48);
        
        // Switch the world to the setting screen
        Greenfoot.setWorld(new settingScreen());
    }
}
