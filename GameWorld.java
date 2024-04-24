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
    public GameState state = GameState.START_SCREEN;
    String background;
    // buttons
    private hitButton hitButton = new hitButton();
    private standButton standButton = new standButton();
    private playButton playButton = new playButton();
    private settingsButton settingsButton = new settingsButton();
    private homeButton homeButton = new homeButton();
    private hitButton abilityButton = new hitButton("Activate Witch");
    private Deck deck = new Deck(3); 
    private BlackjackHand pHand = new BlackjackHand("pHand");
    private BlackjackHand dHand = new BlackjackHand("dHand");
    private Currency CurrencyCount = new Currency();
    confirmBet confirmButton = (new confirmBet());
    private ArrayList<Actor> removeList = new ArrayList<>();
    int GameStateBetCount  = 0;
    int GameStateDEALCount  = 0;
    int GameStatePLAYCount = 0;
    GreenfootImage image = new GreenfootImage(500, 400);
    GreenfootImage pWins = new GreenfootImage("You Win!", 100, Color.BLACK, Color.WHITE);
    GreenfootImage dWins = new GreenfootImage("Dealer Wins!", 100, Color.BLACK, Color.WHITE);
    GreenfootImage push = new GreenfootImage("Draw!", 100, Color.BLACK, Color.WHITE);

    /**
     * Constructor for objects of class GameWorld.
     */
    public GameWorld(GameState state)
    {   
        super(1100, 800, 1);
        this.state = state;
        background = playButton.background;
         
    }

    public GameWorld()
    {   
        super(1100, 800, 1);
        StartScreen();
        playButton.updateBackground();
        if (playButton.background == "background1.png" || playButton.background == "background2.png" || playButton.background == "background3.png"
        || playButton.background == "background4.png"){
            //background = playButton.background;
        } 
        
    }
    
    public GameState getGameState(){
        return state;
    }

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
            if (GameStateBetCount == 1){
                GameStateBetCount = 0;
            }
            state = GameState.BET;
        }
        else if (state == GameState.BET){
            
            if (GameStateBetCount == 0){

            // open betting screen and set bet

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
        homeButton.inStartScreen = false;
        if (confirmButton.activate == 1) {
            state = GameState.DEAL;
            CurrencyCount.setLocation(CurrencyCount.getX()+200, CurrencyCount.getY());
        }
        }
        else if (state == GameState.DEAL){
            if (GameStateDEALCount == 0){
                removeObjects(removeList);
                addObject(deck, 870, 475);
                addObject(dHand,550, 260);
                addObject(pHand,550, 605);

                pHand.add(deck.deal(true));
                Greenfoot.delay(100);
                dHand.add(deck.deal());
                Greenfoot.delay(100);
                pHand.add(deck.deal(true));
                Greenfoot.delay(100);
                dHand.add(deck.deal(true));
                Greenfoot.delay(100);
                state = GameState.PLAY;
                GameStateDEALCount = 1;
            }
        }
        else if (state == GameState.PLAY){
            if (GameStatePLAYCount == 0) {
                addPlayButtons();
                GameStatePLAYCount = 1;
            }
            if (hitButton.getClickedState()){
                Card dealtCard = deck.deal(true);
                pHand.add(dealtCard);
                hitButton.setClickedState(false);
                if (dealtCard.getRank() == Rank.WITCH){
        
                    dealtCard = null;
                    addObject(abilityButton, 500, 400);
                }

            }
            if (standButton.getClickedState()){
                state = GameState.D_PLAY;
                standButton.setClickedState(false);

            } 
            if (abilityButton.getClickedState()){
                pHand.removeAtIndex(pHand.numOfCards-1);
                for (int index = 0; index < pHand.numOfCards -1; index++) {
                Card cardTested = pHand.cards[index];
                if (cardTested.getRank() == Rank.WITCH){
                    pHand.removeAtIndex(index);
                }
                }
                abilityButton.setClickedState(false);
                removeObject(abilityButton);

            }

            pHand.calculateWeight();
            if (pHand.getWeight() == -1){
                state = GameState.FIND_WINNER;
            }
        } else if (state == GameState.D_PLAY){
            dHand.show();
            dHand.calculateWeight();
            if ((dHand.getWeight() <= 16) && (dHand.getWeight() > 0 )){
                Greenfoot.delay(100);
                dHand.add(deck.deal(true));
            } else if (dHand.getWeight() >= 17){
                state = GameState.FIND_WINNER;
            } else if (pHand.getWeight() == 22){
                state = GameState.FIND_WINNER;
            } else if(dHand.getWeight() == -1){
                state = GameState.FIND_WINNER;
            }

        } else if (state == GameState.FIND_WINNER){
            if (dHand.getWeight() == pHand.getWeight()){
                getBackground().drawImage(push, 250, 400);
            } else if(pHand.getWeight() > dHand.getWeight() || dHand.getWeight() == -1) {
                //winnerText WinnerImage = new winnerText("Player Wins");
                //addObject(WinnerImage, 500, 400);
                getBackground().drawImage(pWins, 250, 400);
            } else if(pHand.getWeight() < dHand.getWeight() || pHand.getWeight() == -1) {
                //winnerText WinnerImage = new winnerText("Dealer Wins");
                //addObject(WinnerImage, 500, 400);
                getBackground().drawImage(dWins, 250, 400);
            }
            state = GameState.BET;
            Greenfoot.delay(500);
            Greenfoot.setWorld(new GameWorld(state));
            //Greenfoot.setWorld(new StartScreen());

        }
    }

}
