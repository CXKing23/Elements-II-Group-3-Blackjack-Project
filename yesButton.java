import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class yesButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class yesButton extends button
{
    
    /**
     * Act - do whatever the yesButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public yesButton()
    {
        image = new GreenfootImage("activeButton.png");
            image.scale(170,80);
            setImage(image);
            image.setColor(Color.BLACK);
            image.setFont(new Font("Arial", true, false, 24));
            image.drawString("Yes", 60, 48);
        }
    public void onClick() {
        image = new GreenfootImage("redButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK);
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Yes", 60, 48);
        Greenfoot.delay(duration);
        GreenfootImage image = new GreenfootImage("activeButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK);
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Yes", 60, 48);
        Greenfoot.setWorld(new StartScreen());
    }
}


