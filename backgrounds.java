import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class backgrounds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class backgrounds extends switchButton
{
    /**
     * Act - do whatever the backgrounds wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        switchButton buttonInstance = new switchButton(); // Create an instance of Button
        int count = buttonInstance.getCount(); // Access the getCount() method
        if(count == 0){
            miniConfig("Untitled-9.png");
        }else if(count == 1){
            miniConfig("Untitled-6.png");
        }else if(count == 2){
            miniConfig("Untitled-3 (1).png");
        }else if(count == 3){
            miniConfig("Bow-Axe-Background-1.png");
        }
    }
}