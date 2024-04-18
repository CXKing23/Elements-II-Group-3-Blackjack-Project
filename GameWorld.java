import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    /*GreenfootImage bronzeChip = new GreenfootImage("Chips/bronze_chip.png");
    GreenfootImage silverChip = new GreenfootImage("Chips/silver_chip.png");
    GreenfootImage goldChip = new GreenfootImage("Chips/gold_chip.png"); */
    protected GameState state;
    protected static final int START_MONEY = 1000;
    protected int totalMoney = START_MONEY;
    protected int bet = 0;
    protected button currentBet;
    protected BetButton bronze;
    
    /**
     * Constructor for objects of class GameWorld.
     */
    public GameWorld()
    {   
        super(1100, 800, 1);
        GameState state = GameState.BET;
        
        if (state == GameState.BET) {
            // open betting screen and set bet
            addObject(currentBet = new button("Current Bet: " + bet), 750 , 100);
            addObject(bronze = new BetButton(100), 1000, 250);
            MouseInfo mouse = Greenfoot.getMouseInfo();        
        
            if (mouse != null && Greenfoot.mouseClicked(bronze)) {
                setBet(bronze.getBetAmount() + bet);   
                //not working
            }
        } else if (state == GameState.DEAL) {
            /* open playing screen, set deck, deal cards 
            * to dealer and player, set dealer hand and player hand
            * on screen */
        } else if (state == GameState.PLAY) {
            
        } else if (state == GameState.D_PLAY){
            
        }
    }
     
    public int getTotalMoney() {
        return totalMoney;
    }
    
    public void setBet(int num) {
        if (bet >= 0 && bet + num >= 0) {
            bet += num;
            removeObject(currentBet);
            addObject(currentBet = new button("Current Bet: " + bet), 750, 100);
        }
    }
    
    public int getBet() {
        return bet;
    }
}
