import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class settingButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class settingScreen extends World
{
    /**
     * Constructor for objects of class settingButton.
     * 
     */
    public settingScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 800, 1); 
        
        addObject(new switchButton(), getWidth() / 2 +40 , getHeight() / 2 +30 );      
        addObject(new backgrounds(), getWidth() / 2 , getHeight() / 2 -250 );
        addObject(new homeButton(), getWidth() / 2 -250 , getHeight() / 2 );
    }
}
