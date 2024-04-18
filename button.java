import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button extends Actor
{
    /**
     * Act - do whatever the button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    GreenfootImage Image = new GreenfootImage("background1.png");
    public button(String text) {
        // Create a GreenfootImage with transparent background
        GreenfootImage image = new GreenfootImage(200, 50); // Adjust size as needed
        // Draw text on the image
        image.setColor(Color.BLACK); // Set text color
        image.setFont(new Font("Arial", true, false, 24)); // Set font
        image.drawString(text, 20, 35); // Draw text at position (20, 35)
        setImage(image); // Set the image as the actor's image
    }

    public void act() {
        // Check if the button is clicked
        if (Greenfoot.mouseClicked(this)) {
            onClick(); 
            
        }
    }
    
    // Method to handle button click (to be overridden by subclasses)
    public void onClick() {
    
    }
    
    //Method to set the minibackground in the settings menu to the desired size
    public void miniConfig(String filename){
    GreenfootImage Image = new GreenfootImage(filename);
    Image.scale(300,300);
    setImage(Image);
    }
}