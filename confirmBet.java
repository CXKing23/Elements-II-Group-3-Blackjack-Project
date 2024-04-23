import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class confirmBet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class confirmBet extends button
{
    /**
     * Act - do whatever the hitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage("activeButton.png");
    
    int activate ;
    public confirmBet(){
        image.scale(170, 80);
        setImage(image);
        image.setColor(Color.BLACK);
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Confirm Bet", 15, 48);
        activate = 0;  // Removed redundant variable declaration
    }
    public void onClick(){
        GreenfootImage image = new GreenfootImage("redButton.png");  
        image.scale(170, 80);
        image.setColor(Color.BLACK);
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Confirm Bet", 15, 48);
        setImage(image);
        Greenfoot.delay(duration);
        image = new GreenfootImage("activeButton.png");
        image.scale(170, 80);
        image.setColor(Color.BLACK);
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Confirm Bet", 15, 48);
        setImage(image);
        activate = 1;  // Removed redundant variable declaration
    }
    //public int getState(){
        //return state;
    }

