import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    public GameState state;
    String background;
    // buttons
    hitButton hitButton = new hitButton();
    standButton standButton = new standButton();
    playButton playButton = new playButton();
    settingsButton settingsButton = new settingsButton();
    homeButton homeButton = new homeButton();
    Deck deck = new Deck(3); 
    BlackjackHand pHand = new BlackjackHand("pHand");
    BlackjackHand dHand = new BlackjackHand("dHand");
    confirmBet confirmButton = (new confirmBet());
    private ArrayList<Actor> removeList = new ArrayList<>();
    int GameStateDEALCount  = 0;
    int GameStatePLAYCount = 0;
    /**
     * Constructor for objects of class GameWorld.
     */
    public GameWorld()
    {   
        super(1100, 800, 1);
        if (playButton.background == "background1.png" || playButton.background == "background2.png" || playButton.background == "background3.png"
        || playButton.background == "background4.png"){

            state = GameState.BET;
        } 
        if (state == GameState.BET) {

            // open betting screen and set bet
            Currency CurrencyCount = new Currency();
            removeList.add(CurrencyCount);
            bronzeChip BronzeChip = new bronzeChip("Chips/bronze_chip.png");
            removeList.add(BronzeChip);
            bronzeChip SilverChip = new bronzeChip("Chips/silver_chip.png");
            removeList.add(SilverChip);
            bronzeChip GoldChip = new bronzeChip("Chips/gold_chip.png");
            removeList.add(GoldChip);
            bronzeChip allInChip = new bronzeChip("redButton.png");
            removeList.add(allInChip);
            removeList.add(confirmButton);

            addObject(BronzeChip, getWidth() / 2-200 , getHeight() / 2 );
            addObject(SilverChip, getWidth() / 2 , getHeight() / 2 );
            addObject(GoldChip, getWidth() / 2+200 , getHeight() / 2 );
            addObject(allInChip , getWidth() / 2 , getHeight() / 2 +150);
            addObject(confirmButton, getWidth() / 2 , getHeight() / 2 +250);
            addObject(CurrencyCount, getWidth() / 2 , getHeight() / 2 -200);
            addObject(homeButton, getWidth() / 2 -450 , getHeight() / 2 );


        }
    }
    public GameState getGameState(){
        return state;
    }

    //if (state == GameState.DEAL) {
        /* open playing screen, set deck, deal cards
         * to dealer and player, set dealer hand and player hand
         * on screen

        //StartScreen();

        //  if (state == GameState.DEAL) {
        /* open playing screen, set deck, deal cards
         * to dealer and player, set dealer hand and player hand
         * on screen */
        //} else if (state == GameState.PLAY) {
        // addObject(new hitButton(), getWidth() / 2 +470 , getHeight() / 2-60 );
        // addObject(new standButton(), getWidth() / 2 +470 , getHeight() / 2+150 );
        //} else if (state == GameState.D_PLAY){
        //  removeObject(hitButton);
        //removeObject(standButton);

        //}

        /**addObject(new confirmBet(), getWidth() / 2 , getHeight() / 2 +500);
        removeObject(homeButton);
        removeObject(confirmButton);
        addObject(deck, 870, 475);
        addObject(dHand,550, 260);
        addObject(pHand,550, 605);

        pHand.add(deck.deal(true));
        //Greenfoot.delay(50);
        dHand.add(deck.deal());
        //Greenfoot.delay(50);
        pHand.add(deck.deal(true));
        //Greenfoot.delay(50);
        dHand.add(deck.deal(true));
        //Greenfoot.delay(50);
         */


        


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

public void addPlayButtons(){
addObject(hitButton, 100, 300);
addObject(standButton, 100, 500);
}

public void act(){
    if (state == GameState.START_SCREEN) {

    }
    if (state == GameState.BET){
        homeButton.inStartScreen = false;
        if (confirmButton.activate == 1) {
         state = GameState.DEAL;
        }
    }
    if (state == GameState.DEAL){
        if (GameStateDEALCount == 0){
            removeObjects(removeList);
            addObject(deck, 870, 475);
            addObject(dHand,550, 260);
            addObject(pHand,550, 605);

            pHand.add(deck.deal(true));
            Greenfoot.delay(50);
            dHand.add(deck.deal());
            Greenfoot.delay(50);
            pHand.add(deck.deal(true));
            Greenfoot.delay(50);
            dHand.add(deck.deal(true));
            Greenfoot.delay(50);
            state = GameState.PLAY;
            GameStateDEALCount = 1;
        }
    }
    if (state == GameState.PLAY){
         if (GameStatePLAYCount == 0) {
            addPlayButtons();
            GameStatePLAYCount = 1;
         }
         if (pHand.getWeight() > 21 || dHand.getWeight() > 21){}
    }
}

/**
 *  removeButtons();
//addButtons();
if (playButton.background == "background1.png" || playButton.background == "background2.png" || playButton.background == "background3.png"
|| playButton.background == "background4.png"){

state = GameState.BET;
}
if (state == GameState.BET) {
// open betting screen and set bet
addObject(new bronzeChip("Chips/bronze_chip.png"), getWidth() / 2-200 , getHeight() / 2 );
addObject(new bronzeChip("Chips/silver_chip.png"), getWidth() / 2 , getHeight() / 2 );
addObject(new bronzeChip("Chips/gold_chip.png"), getWidth() / 2+200 , getHeight() / 2 );
addObject(new bronzeChip("redButton.png"), getWidth() / 2 , getHeight() / 2 +150);
addObject(new confirmBet(), getWidth() / 2 , getHeight() / 2 +250);
addObject(new Currency(), getWidth() / 2 , getHeight() / 2 -200);
addObject(homeButton, getWidth() / 2 -450 , getHeight() / 2 );
if(confirmBet.activate == 1){
state = GameState.DEAL;
}else if (state == GameState.DEAL) {
/* open playing screen, set deck, deal cards
 * to dealer and player, set dealer hand and player hand
 * on screen */
 
}
