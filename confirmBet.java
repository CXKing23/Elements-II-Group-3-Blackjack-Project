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
       //GameState state = GameState.DEAL;
    public confirmBet(){
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Confirm Bet", 15, 48);
    }
    public void onClick(){
        image= new GreenfootImage("redButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Confirm Bet", 15, 48);
        Greenfoot.delay(duration);
        GreenfootImage image = new GreenfootImage("activeButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Confirm Bet", 15, 48);    
    }
    //public int getState(){
        //return state;
    }

