import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card extends Actor
{
    private static final double SCALE = 1.20; 
    private Rank rank;
    private Suit suit;
    private GreenfootImage backImage;
    private GreenfootImage faceImage;
    private boolean isFaceUp;

    /* vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
     * To create a card, you do:
     * 
     * Rank.(card name in all caps)
     *      (includes face cards and number cards)
     *      
     * Suit.(suit name in all caps)
     *      (NATURE, WATER, FIRE, EARTH, SPECIAL)
     * 
     *  Fortune Teller = Rank.FT Suit.SPECIAL
     *  Witch = Rank.WITCH Suit.SPECIAL
     * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
     */
    public Card(Rank rank, Suit suit) {
        this(rank, suit, false);
    }

    /* vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
     * To create a card, you do:
     * 
     * Rank.(card name in ALL CAPS)
     *      (includes face cards and number cards)
     *      
     * Suit.(suit name in ALL CAPS)
     *      (NATURE, WATER, FIRE, EARTH, SPECIAL)
     *      
     * true / false
     * 
     * Fortune Teller = Rank.FT Suit.SPECIAL
     * Witch = Rank.WITCH Suit.SPECIAL
     * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
     */
    public Card(Rank rank, Suit suit, Boolean isFaceUp) {
        this.isFaceUp = isFaceUp;
        this.rank =  rank;
        this.suit = suit;
        backImage = new GreenfootImage("BackOfCards.png");
        String suitName = "earth";
        String folderName = "EarthCards";
        switch (suit) {
            case NATURE:
                suitName = "nature";
                folderName = "NatureCards";
                break;
            case WATER:
                suitName = "water";
                folderName = "WaterCards";
                break;
            case FIRE:
                suitName = "fire";
                folderName = "FireCards";
                break;
            case SPECIAL:
                suitName = "special";
                folderName = "SpecialCards";
                break;
        }
        
        faceImage = new GreenfootImage(folderName+"/"+rank.getRank()+"_of_" + suitName + ".png");
        //backImage.scale((int)(backImage.getWidth()*SCALE), (int)(backImage.getHeight()*SCALE));
        //faceImage.scale((int)(faceImage.getWidth()*SCALE), (int)(faceImage.getHeight()*SCALE));
        backImage.scale((int) (75 * SCALE),(int) (105 * SCALE));
        faceImage.scale((int) (75 * SCALE),(int) (105 * SCALE));
        if (isFaceUp) {
            setImage(faceImage);
        } else {
            setImage(backImage);
        }
    }

    public void show() {
        isFaceUp = true;
        setImage(faceImage);
    }

    public void hide() {
        isFaceUp = false;
        setImage(backImage);
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit(){
        return suit;
    }

    /**
     * Act - do whatever the Card wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
    }
}
