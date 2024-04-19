import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    /**
     * Constructor for objects of class GameWorld.
     */
    public GameWorld()
    {   
        super(1100, 800, 1);
        GameState state = GameState.BET;
        hitButton hitButton = new hitButton();
        standButton standButton = new standButton();
        if (state == GameState.BET) {
            // open betting screen and set bet
            }
         else if (state == GameState.DEAL) {
            /* open playing screen, set deck, deal cards 
            * to dealer and player, set dealer hand and player hand
            * on screen */
        } else if (state == GameState.PLAY) {
            addObject(new hitButton(), getWidth() / 2 +470 , getHeight() / 2-60 );
            addObject(new standButton(), getWidth() / 2 +470 , getHeight() / 2+150 );
        } else if (state == GameState.D_PLAY){
            removeObject(hitButton);
            removeObject(standButton);

        }
        addObject(new homeButton(), getWidth() / 2 -450 , getHeight() / 2-100 );
        
    }
}
