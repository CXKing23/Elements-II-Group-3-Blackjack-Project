import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Represents a button for the "Stand" action in a game.
 * 
 * This class extends the button class and defines the behavior of the standButton.
 * When clicked, it changes its appearance and triggers an action, indicating that the player has chosen to stand.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class standButton extends button
{
    private boolean wasClicked = false;
    GreenfootImage image = new GreenfootImage("activeButton.png");
    
    /**
     * Constructor for creating a standButton.
     * Initializes the button with the default appearance and text.
     */
    public standButton(){
        image.scale(170, 80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Stand", 50, 48);
    }

    /**
     * Retrieves the state of whether the button was clicked.
     * 
     * @return true if the button was clicked, false otherwise
     */
    public boolean getClickedState(){
        return wasClicked;
    }
    
    /**
     * Sets the state of whether the button was clicked.
     * 
     * @param bool true to indicate that the button was clicked, false otherwise
     */
    public void setClickedState(boolean bool){
        wasClicked = bool;
    }
    
    /**
     * Defines the behavior of the standButton when clicked.
     * Changes the appearance of the button when clicked and triggers an action.
     */
    public void onClick(){
        // Change the appearance of the button when clicked
        image = new GreenfootImage("redButton.png");
        image.scale(170, 80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Stand", 50, 48);
        
        // Add a delay to show the clicked state
        Greenfoot.delay(duration);
        
        // Restore the original appearance of the button
        image = new GreenfootImage("activeButton.png");
        image.scale(170, 80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Stand", 50, 48);
        
        // Add functionality here
        wasClicked = true;
    }
}
