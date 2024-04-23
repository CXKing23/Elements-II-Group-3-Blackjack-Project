import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class warningScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class warningScreen extends World
{

    /**
     * Constructor for objects of class warningScreen.
     * 
     */
    public warningScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 800, 1); 
        
        setBackground("recycpap.jpg");
        addObject(new warningText(), getWidth() / 2 , getHeight() / 2-200 );
        addObject(new yesButton(), getWidth() / 2-200 , getHeight() / 2+100 );
        addObject(new noButton(), getWidth() / 2+200 , getHeight() / 2+100 );
    }
        
    }

