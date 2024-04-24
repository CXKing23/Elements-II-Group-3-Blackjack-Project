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
    static int Bet; 
    static final int startingBalance = 1000;
    GreenfootImage image; 
    public Currency()
    {
        currentBalance = startingBalance;
        setImage(image);
    }
    public void setBalance(int newBalance){
        currentBalance = newBalance;
    }
   
    public int getBalance() {
        return currentBalance;
    }
    
     public void act(){
            image = new GreenfootImage("Balance: " + bronzeChip.getBalance(), 24, Color.BLACK, new Color(0, 0, 0, 0));
            setImage(image);
        }
}
