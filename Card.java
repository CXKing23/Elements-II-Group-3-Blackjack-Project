import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Actor
{
    private static final double SCALE = 0.6;
    private Rank rank;
    private Suit suit;
    private GreenfootImage backImage;
    private GreenfootImage faceImage;
    private boolean isFaceUp;
    
    public Card(Rank rank, Suit suit)
    {
        this(rank, suit, false);
    }
    
    public Card(Rank rank, Suit suit, Boolean isFaceUp){
        this.isFaceUp = isFaceUp;
        this.rank = rank;
        this.suit = suit;
        backImage = new GreenfootImage("cardBack-abstract.png");
        String suitName = "Clubs/clubs";
        switch (suit){
            case DIAMOND:
                suitName = "Diamonds/diamonds";
                break;
            case SPADE:
                suitName = "Spades/spades";
                break;
            case HEART:
                suitName = "Hearts/hearts";
                break;
        }
        faceImage = new GreenfootImage(suitName+"_"+rank.getRank()+".png");
        backImage.scale((int)(backImage.getWidth()*SCALE), (int)(backImage.getHeight()*SCALE));
        faceImage.scale((int)(faceImage.getWidth()*SCALE), (int)(faceImage.getHeight()*SCALE));
        setImage(backImage);
    }
    
    public void show()
    {
        isFaceUp = true;
        setImage(faceImage);
    }

    public void hide()
    {
        isFaceUp = false;
        setImage(backImage);
    }

    public boolean isFaceUp()
    {
        return isFaceUp;
    }

    public Rank getRank()
    {
        return rank;
    }

    public Suit getSuit(){
        return suit;
    }

    /**
     * Act - do whatever the Card wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
