import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RulesButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RulesButton extends Actor
{
    
    public RulesButton(){
        // Create a GreenfootImage with transparent background
        GreenfootImage image = new GreenfootImage(200, 70); // Adjust size as needed
        // Draw text on the image
        image.setColor(Color.RED); // Set text color
        image.setFont(new Font("Arial", true, false, 50)); // Set font
        image.drawString("?", 20, 50); // Draw text at position (20, 35)
        setImage(image); // Set the image as the actor's image
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new RulesScreen());  
        }
    }
    
}
