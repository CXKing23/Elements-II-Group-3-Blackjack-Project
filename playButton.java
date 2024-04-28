import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Represents a button for initiating the "Play" action in a game.
 * 
 * Inherits from the button class and overrides the onClick method to define the behavior when clicked.
 * 
 * When clicked, the button changes its appearance briefly, triggers an action to update the background,
 * and resets the current balance of the bronze chip to the default value.
 * 
 * The button is typically represented by an image of a button with the text "Play".
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class playButton extends button
{
    public int count = super.count; // Removed redundant initialization
    public GreenfootImage image = new GreenfootImage("activeButton.png");
    public String background;

    /**
     * Constructor for creating a playButton.
     * Initializes the button with default appearance and text, and sets the default background image.
     */
    public playButton(){
        // Set default appearance and text of the button
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Play", 60, 48);
        background = "background1.png"; // Set default background image
    }

    /**
     * Updates the background image based on the count value.
     */
    public void updateBackground(){
        // Update background image based on the count value
        if(this.count == 0){
            background = "background1.png";
            Greenfoot.setWorld(new background(background));
        } else if(this.count == 1){
            background = "background2.png";
            Greenfoot.setWorld(new background(background));
        } else if(this.count == 2){
            background = "background3.png";
            Greenfoot.setWorld(new background(background));
        } else if(this.count == 3){
            background = "background4.png";
            Greenfoot.setWorld(new background(background));
        }
    }

    /**
     * Method called when the playButton is clicked.
     * Changes the appearance of the button briefly and triggers an action to update the background image
     * and reset the current balance of the bronze chip to the default value.
     */
    public void onClick(){
        // Change button appearance briefly
        image = new GreenfootImage("redButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Play", 60, 48);
        
        Greenfoot.delay(duration); // Brief delay to show the button click effect
        
        // Restore the original button appearance
        GreenfootImage image = new GreenfootImage("activeButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Play", 60, 48);
        
        // Trigger the action: update the background image and reset the current balance of the bronze chip
        updateBackground();
        bronzeChip.currentBalance = 5000; // Reset current balance of the bronze chip to default value
    }
}
