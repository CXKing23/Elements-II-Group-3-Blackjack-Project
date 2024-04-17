import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CardGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class CardGame extends Actor
{
    private int numberOfDecks;
    private Deck gameDeck;

    public CardGame(int numberOfDecks){
        this.numberOfDecks = numberOfDecks;
        newGame();
    }

    protected Deck getGameDeck(){
        return gameDeck;
    }

    public void newGame(){
        gameDeck = new Deck(numberOfDecks);
        gameDeck.shuffle();
    }
    
    /**
     * Act - do whatever the CardGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
