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
    
    GreenfootImage image = new GreenfootImage("redButton.png");

    // Override the onClick method to switch to the SettingScreen
    public settingsButton(){
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Setting", 45, 48);
    }
    public void onClick() {
        // Switch the world to SettingScreen
        Greenfoot.setWorld(new settingScreen());
    }

    }