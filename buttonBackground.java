import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buttonBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buttonBackground extends Actor
{
    /**
     * Act - do whatever the buttonBackground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage Image = new GreenfootImage("redButton.png");
        Image.scale(175,80);
        setImage(Image);
    }
}