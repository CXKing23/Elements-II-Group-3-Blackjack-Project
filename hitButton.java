import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hitButton extends button
{
    /**
     * Act - do whatever the hitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       GreenfootImage image = new GreenfootImage("activeButton.png");
    public hitButton(){
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Hit", 70, 48);
    }
    public void onClick(){
        image= new GreenfootImage("redButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Hit", 70, 48);
        Greenfoot.delay(duration);
        GreenfootImage image = new GreenfootImage("activeButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Hit", 70, 48);    
        //add functionality here
    }
}
