import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button extends Actor
{
    static int count; 
    static int duration = 10;
    
    /**
     * Act - do whatever the button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected static GreenfootImage image = new GreenfootImage("activeButton.png");
    GreenfootImage Image = new GreenfootImage("background1.png");
    
    public button() {
        
    }

    public button(String filename){
        GreenfootImage customimage = new GreenfootImage(filename);
        customimage.scale(150,150);
        setImage(customimage);
    }

    
    public void act() {
        // Check if the button is clicked
        if (Greenfoot.mousePressed(this)) {
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