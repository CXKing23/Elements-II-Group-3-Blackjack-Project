import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class representing a button in the Greenfoot environment.
 * Buttons can be clicked by the user, and subclasses can override the onClick method to handle button clicks.
 * 
 * This class provides constructors for creating buttons with custom images, and methods for setting button images and handling clicks.
 * 
 * Additionally, it includes a method for setting the size of the button's image.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class button extends Actor
{

    static int count; 
    static int duration = 10;

    static int count; // Static variable to track the count of buttons created
    
    protected static GreenfootImage image = new GreenfootImage("activeButton.png"); // Default image for buttons
    GreenfootImage Image = new GreenfootImage("background1.png"); // Default image for background

    
    /**
     * Default constructor for button class.
     */

    protected static GreenfootImage image = new GreenfootImage("activeButton.png");
    GreenfootImage Image = new GreenfootImage("background1.png");
    


    public button() {
        
    }

    /**
     * Constructor for creating a button with a custom image.
     * 
     * @param filename The filename of the image to use for the button.
     */
    public button(String filename){
        GreenfootImage customimage = new GreenfootImage(filename);
        customimage.scale(150,150);
        setImage(customimage);
    }

    /**
     * Method called when the button is clicked.
     * Subclasses can override this method to define custom behavior for button clicks.
     */
    public void act() {
        // Check if the button is clicked
        if (Greenfoot.mousePressed(this)) {
            onClick();

    


        }
    }
    
    /**
     * Method to handle button click.
     * This method is meant to be overridden by subclasses to define custom behavior for button clicks.
     */
    public void onClick() {
         
    
    }
    
    /**
     * Method to set the image of the button to a custom image.
     * 
     * @param filename The filename of the custom image to use for the button.
     */
    public void miniConfig(String filename){
        GreenfootImage Image = new GreenfootImage(filename);
        Image.scale(300,300); // Scale the image to desired size
        setImage(Image);
    }
}
