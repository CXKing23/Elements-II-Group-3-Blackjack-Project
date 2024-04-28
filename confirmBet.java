import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Represents a button used to confirm a bet in the game.
 * 
 * This class extends the button class and provides functionality for confirming a bet.
 * When clicked, it changes its appearance briefly to indicate activation.
 * 
 * The button displays the text "Confirm Bet" and changes its color when clicked.
 * 
 * The activation status of the button is indicated by the `activate` variable:
 * - 0: Not activated
 * - 1: Activated
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class confirmBet extends button
{
    public GreenfootImage image = new GreenfootImage("activeButton.png");
    public int activate;

    /**
     * Constructs a confirmBet button with default settings.
     */
    public confirmBet(){
        image.scale(170, 80);
        setImage(image);
        image.setColor(Color.BLACK);
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Confirm Bet", 15, 48);
        activate = 0;  
    }
    
    /**
     * Handles the behavior when the button is clicked.
     * Changes the appearance briefly to indicate activation.
     */
    public void onClick(){
        GreenfootImage image = new GreenfootImage("redButton.png");  
        image.scale(170, 80);
        image.setColor(Color.BLACK);
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Confirm Bet", 15, 48);
        setImage(image);
        Greenfoot.delay(duration);
        image = new GreenfootImage("activeButton.png");
        image.scale(170, 80);
        image.setColor(Color.BLACK);
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Confirm Bet", 15, 48);
        setImage(image);
        activate = 1;  
    }
}
