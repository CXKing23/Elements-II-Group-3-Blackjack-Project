import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class representing a playing card.
 * Each card has a rank and a suit, and can be face-up or face-down.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class Card extends Actor
{
    private static final double SCALE = 1.40; // Scaling factor for card images
    private Rank rank;         // Rank of the card
    private Suit suit;         // Suit of the card
    private GreenfootImage backImage; // Image for the back of the card
    private GreenfootImage faceImage; // Image for the face of the card
    private boolean isFaceUp;  // Bool indicating if the card is face-up or face-down
    private boolean isSpecial = false;

    /**
     * Constructor for creating a card with specified rank and suit.
     * 
     * @param rank The rank of the card.
     * @param suit The suit of the card.
     */
    public Card(Rank rank, Suit suit) {
        this(rank, suit, false); // Call the other constructor with isFaceUp set to false
    }

    /**
     * Constructor for creating a card with specified rank, suit, and face-up status.
     * 
     * @param rank The rank of the card.
     * @param suit The suit of the card.
     * @param isFaceUp Boolean indicating whether the card is face-up or face-down.
     */
    public Card(Rank rank, Suit suit, Boolean isFaceUp) {
        this.isFaceUp = isFaceUp; // Set the face-up status
        this.rank =  rank;        // Set the rank
        this.suit = suit;         // Set the suit
        if (suit == Suit.SPECIAL) {
            isSpecial = true;
        }
        // Determine the folder and filename for the card image based on the suit
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
        
        // Load the appropriate image for the face of the card
     
        faceImage = new GreenfootImage(folderName+"/"+rank.getRank()+"_of_" + suitName + ".png");
        
        // Load the image for the back of the card
        backImage = new GreenfootImage("BackOfCards.png");
        
        // Scale the images
        backImage.scale((int) (75 * SCALE),(int) (105 * SCALE));
        faceImage.scale((int) (75 * SCALE),(int) (105 * SCALE));
        
        // Set the image of the card based on its face-up status
        if (isFaceUp) {
            setImage(faceImage);
        } else {
            setImage(backImage);
        }
    }

    /**
     * Method to show the face of the card.
     */
    public void show() {
        isFaceUp = true;   // Set the face-up status to true
        setImage(faceImage); // Set the image to the face image
    }

    /**
     * Method to hide the face of the card.
     */
    public void hide() {
        isFaceUp = false;  // Set the face-up status to false
        setImage(backImage); // Set the image to the back image
    }

    /**
     * Method to check if the card is face-up.
     * 
     * @return True if the card is face-up, false otherwise.
     */
    public boolean isFaceUp() {
        return isFaceUp;
    }

    /**
     * Method to get the rank of the card.
     * 
     * @return The rank of the card.
     */
    public Rank getRank() {
        return rank;
    }
    /**
     * Method to cehck if the card is a Special card or not.
     * 
     * @return True if the card is a Special card .
     */
    public boolean isSpecial() {
        return isSpecial;
    }

    /**
     * Method to get the suit of the card.
     * 
     * @return The suit of the card.
     */
    public Suit getSuit(){
        return suit;
    }
    /**
     * Act method.
     * This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
    }
}
