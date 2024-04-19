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
    
        if(count == 0){
            miniConfig("background1.png");
        }else if(count == 1){
            miniConfig("background2.png");
        }else if(count == 2){
            miniConfig("background3.png");
        }else if(count == 3){
            miniConfig("background4.png");
        }
    }
    
}