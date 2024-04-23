import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class warningText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class warningText extends Actor
{
    /**
     * Act - do whatever the warningText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        GreenfootImage image = new GreenfootImage("Are you sure you want to exit, your progress will not be saved.", 100, Color.BLACK, new Color(0, 0, 0, 0));

        image.scale(1000,100);
        setImage(image);
        
    }
}
