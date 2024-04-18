import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playButton extends button
{
/**
     * Act - do whatever the playButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public playButton()
    {
        super("Play");
    }
    public void onClick(){
        switchButton buttonInstance = new switchButton(); // Create an instance of Button
        int count = buttonInstance.getCount(); // Access the getCount() method   
        if(count == 0){
            Greenfoot.setWorld(new background1());
        }else if(count == 1){
            Greenfoot.setWorld(new background2());
        }else if(count == 2){
            Greenfoot.setWorld(new background3());
        }else if(count == 3){
            Greenfoot.setWorld(new background4());
    }
}
}