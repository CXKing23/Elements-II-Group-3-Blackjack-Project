import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BetButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BetButton extends button
{
    String name;
    private int betAmount;
    private int totalBet = 0;
    GreenfootImage b = new GreenfootImage("Chips/bronze_chip.png");
    GreenfootImage s = new GreenfootImage("Chips/silver_chip.png");
    GreenfootImage g = new GreenfootImage("Chips/gold_chip.png");
        

    
    public BetButton(int betAmount) {
        super("Bet" + betAmount);
        this.betAmount = betAmount;
        if (betAmount == 100) {
            b.scale(100,100);
            setImage(b);
            name = "bronze";
        } else if (betAmount == 500) {
            s.scale(100,100);
            setImage(s);
            name = "silver";
        } else if (betAmount == 1000) {
            s.scale(100,100);
            setImage(s);
            name = "gold";
        }
    }
    
    public int getBetAmount() {
        return betAmount;
    }
    
    public String getName() {
        return name;
    }
    
    public int getTotalBet() {
        return totalBet;
    }
    
    public void act() {
        // Check if the button is clicked
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if (mouse != null && Greenfoot.mouseClicked(this)) {
            int buttonPressed = mouse.getButton();
        
            if (buttonPressed == 1){
                totalBet += betAmount;
            }else if (buttonPressed == 3 && totalBet - betAmount >= 0) {
                totalBet -= betAmount;
            }
        }
        // might not work
    }

    public void onClick() {
        
    }
}
