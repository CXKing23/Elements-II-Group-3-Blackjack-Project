import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends GameWorld
{
    /**
     * Constructor for objects of class background1.
     * 
     * public background(String background){
     *  
        setBackground(background);
        }
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(1100, 800, 1); 
        setBackground("background1.png");
    }
     */
    public background(String filename)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(1100, 800, 1); 
        setBackground(filename);
    }
}
