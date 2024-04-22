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
    String background;
    // buttons
    hitButton hitButton = new hitButton();
    standButton standButton = new standButton();
    playButton playButton = new playButton();
    settingsButton settingsButton = new settingsButton();
    homeButton homeButton = new homeButton();
    
    
    /**
     * Constructor for objects of class GameWorld.
     */
    public GameWorld()
    {   
        super(1100, 800, 1);

        GameState state = GameState.BET;
        hitButton hitButton = new hitButton();
        standButton standButton = new standButton();
        homeButton button = new homeButton();
        addObject(button, getWidth() / 2 -450 , getHeight() / 2-100 );
    

        StartScreen();

        if (state == GameState.BET) {
            // open betting screen and set bet
            addObject(new bronzeChip("Chips/bronze_chip.png"), getWidth() / 2-200 , getHeight() / 2 );
            addObject(new bronzeChip("Chips/silver_chip.png"), getWidth() / 2 , getHeight() / 2 );
            addObject(new bronzeChip("Chips/gold_chip.png"), getWidth() / 2+200 , getHeight() / 2 );
            addObject(new bronzeChip("redButton.png"), getWidth() / 2 , getHeight() / 2 +150);
            addObject(new confirmBet(), getWidth() / 2 , getHeight() / 2 +250);
            addObject(new Currency(), getWidth() / 2 , getHeight() / 2 -200);
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

        
        

    }
    
    public void StartScreen()
    {     
        addObject(playButton, getWidth() / 2 , getHeight() / 2 -50);
        addObject(settingsButton, getWidth() / 2 , getHeight() / 2 +30);
        background = "Start Up.png";
        setBackground(background);
    }
    
    public void SettingScreen()
    { 
        background = "recycpap.jpg";
        setBackground(background);
        addObject(new switchButton(), getWidth() / 2 +10 , getHeight() / 2 +30 );      
        addObject(new backgrounds(), getWidth() / 2 , getHeight() / 2 -250 );
        addObject(new homeButton(), getWidth() / 2 -280 , getHeight() / 2 );
    }
    
    public void WarningScreen()
    {     
        background = "recycpap.jpg";
        setBackground(background);
    }
    
    public void removeButtons(){
        if (playButton.background != "Start Up.png"){
            removeObject(playButton);
            removeObject(settingsButton);
        }
    }
    
    public void addButtons(){
            addObject(homeButton, getWidth() / 2 -450 , getHeight() / 2 );
            addObject(hitButton, 100, 300);
            addObject(standButton, 100, 500);
    }
    
    public void act(){
        removeButtons();
        addButtons();
        if (playButton.background == "background1.png" || playButton.background == "background2.png" || playButton.background == "background3.png" 
        || playButton.background == "background4.png"){
            addButtons();
            state = GameState.BET;
        }

    }
}
