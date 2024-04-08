import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class settingsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class settingsButton extends button
{

    /**
     * Act - do whatever the settingsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public settingsButton() {
        super("Settings"); // Call the superclass constructor with the text "Settings"
    }

    // Override the onClick method to switch to the SettingScreen
    public void onClick() {
        // Switch the world to SettingScreen
        Greenfoot.setWorld(new settingScreen());
    }

    }

