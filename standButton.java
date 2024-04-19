import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class standButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class standButton extends button
{
    /**
     * Act - do whatever the hitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       GreenfootImage image = new GreenfootImage("activeButton.png");
    public standButton(){
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Stand", 50, 48);
    }
    public void onClick(){
        image= new GreenfootImage("redButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Stand", 50, 48);
        Greenfoot.delay(75);
        GreenfootImage image = new GreenfootImage("activeButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Stand", 50, 48);    
        //add functionality here
    }
}
