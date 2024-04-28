import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Represents the setting screen in the game.
 * 
 * This class creates a setting screen world with various interactive components such as switchButton,
 * backgrounds, and homeButton. It sets the background image of the setting screen and positions the 
 * components accordingly.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class settingScreen extends World
{
    /**
     * Constructor for settingScreen objects.
     * 
     * Initializes the setting screen world with a specific size and background image.
     * Creates and adds switchButton, backgrounds, and homeButton objects to the world.
     */
    public settingScreen()
    {    
        // Create a new world with 1100x800 cells and a cell size of 1x1 pixels.
        super(1100, 800, 1); 
        
        // Set the background image of the setting screen
        setBackground("recycpap.jpg");
        
        // Add switchButton to control settings
        addObject(new switchButton(), getWidth() / 2 + 10 , getHeight() / 2 + 30);      
        
        // Add backgrounds to select different backgrounds
        addObject(new backgrounds(), getWidth() / 2, getHeight() / 2 - 250);
        
        // Add homeButton to return to the start screen
        addObject(new homeButton(), getWidth() / 2 - 280, getHeight() / 2);
    }
}
