import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class representing a button for performing the "Hit" action in a game.
 * This button changes its appearance when clicked and triggers an action.
 * 
 * It inherits from the button class and overrides the onClick method to define the behavior when clicked.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class hitButton extends button
{
    /**
     * Constructor for creating a hitButton.
     * Initializes the button with the default appearance and text.
     */
    GreenfootImage image = new GreenfootImage("activeButton.png");
    public hitButton(){
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Hit", 70, 48);
    }
    
    /**
     * Method called when the hitButton is clicked.
     * Changes the appearance of the button when clicked and triggers an action.
     */
    public void onClick(){
        image= new GreenfootImage("redButton.png"); // Change button appearance
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Hit", 70, 48);
        Greenfoot.delay(75); // Delay to show the clicked state
        GreenfootImage image = new GreenfootImage("activeButton.png"); // Restore default appearance
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Hit", 70, 48);    
        // Add functionality here
    }
}