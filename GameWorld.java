import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    GameState state;
    /**
     * Constructor for objects of class GameWorld.
     */
    public GameWorld()
    {   
        super(1100, 800, 1);
        GameState state = GameState.BET;
        
        if (state == GameState.BET) {
            // open betting screen and set bet
        } else if (state == GameState.DEAL) {
            /* open playing screen, set deck, deal cards 
            * to dealer and player, set dealer hand and player hand
            * on screen */
        } else if (state == GameState.PLAY) {
            
        } else if (state == GameState.D_PLAY){
            
        }
    }
    
}
