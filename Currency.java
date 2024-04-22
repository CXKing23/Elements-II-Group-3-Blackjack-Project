import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Currency here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Currency extends Actor
{
    /**
     * Act - do whatever the Currency wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int currentBalance;
    int Bet; 
    static int Balance = 1000;
    GreenfootImage image; 
    public Currency()
    {
        currentBalance = Balance;
        setImage(image);
    }
    public void act(){
        image = new GreenfootImage("Balance: " + bronzeChip.getBalance(), 24, Color.BLACK, new Color(0, 0, 0, 0));
        setImage(image);
    }
    public int getBalance() {
        return currentBalance;
    }
}
