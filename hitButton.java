import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Represents a button for performing the "Hit" action in a game.
 * This button changes its appearance when clicked and triggers an action.
 * 
 * Inherits from the button class and overrides the onClick method to define the behavior when clicked.
 * 
 * The appearance of the button changes briefly to indicate activation when clicked.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class hitButton extends button
{   
    private boolean wasClicked = false; // Indicates if the button was clicked
    private String name = "Hit"; // Default button text
    private int width = 70; // Default width for drawing text

    /**
     * Constructor for creating a hitButton with default settings.
     * Initializes the button with the default appearance and text.
     */
    GreenfootImage image = new GreenfootImage("activeButton.png");
    
    public hitButton(){
        image = new GreenfootImage("activeButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString(name, 70, 48); // Default position for drawing text
    }

    /**
     * Constructor for creating a hitButton with custom name and appearance.
     * 
     * @param name The text to display on the button.
     */
    public hitButton(String name){
        // Adjust width for drawing text based on the provided name
        if (name.equals("Continue") || name.equals("Activate")){
            width = 35;
        }
        this.name = name;
        image = new GreenfootImage("activeButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK);
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString(this.name, width, 48); // Draw text at the specified width
    }
    
    /**
     * Gets the state of the button (whether it was clicked or not).
     * 
     * @return True if the button was clicked, false otherwise.
     */
    public boolean getClickedState(){
        return wasClicked;
    }
    
    /**
     * Sets the state of the button (whether it was clicked or not).
     * 
     * @param bool True to indicate the button was clicked, false otherwise.
     */
    public void setClickedState(boolean bool){
        wasClicked = bool;
    }
    
    /**
     * Method called when the hitButton is clicked.
     * Changes the appearance of the button when clicked and triggers an action.
     */
    public void onClick(){
        // Change button appearance to indicate activation
        image= new GreenfootImage("redButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString(this.name, width, 48);

        Greenfoot.delay(duration); // Delay to briefly show the clicked state
        
        // Restore default appearance after delay
        GreenfootImage image = new GreenfootImage("activeButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString(this.name, width, 48);    
        
        // Add functionality here
        wasClicked = true; // Set the button clicked state to true
    }
}
