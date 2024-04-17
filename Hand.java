import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hand extends Deck
{
    private  String name;

    /**
     * Constructor that intializes the instance of hand to name.
     * 
     * @param name a string that represents the hand.
     */
    public Hand(String name){
        this.name = name;
    }
    
    /**
     *  Returns the name associated with this hand.
     * 
     * @param name a string that represents the hand.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     *  This deals a card from the hand face up.
     * 
     * @returns a card from this hand that is face up.
     */
    public Card throwCard() {
        return deal(true);
    }

    /**
     * Creates an image of this hand where all the cards are spread and, if face up,
     * can be seen.
     */
    protected void setImage() 
    {
        Card[] cards = getCards();
        int numOfCards = getSize();
        if (numOfCards > 0){
            GreenfootImage cardImage = cards[0].getImage();
            int height = cardImage.getHeight();
            int width = cardImage.getWidth();
            int heightInc = (int)(height * .1);
            int widthInc = (int)(width * .15) ;
            GreenfootImage image = new GreenfootImage(width + widthInc*numOfCards, 
                                                        height+heightInc*numOfCards);
            int x = 0;
            int y = 0;
            for(int index = 0; index < numOfCards; index++){
                image.drawImage(cards[index].getImage(),x,y);
                x += widthInc;
                y += heightInc;
            }
            setImage(image);
        }
    }
    
    /**
     * Adds a aCard to this hand.
     * 
     * @param aCard a card to be added to this hand.
     */
    public void add(Card aCard){
        super.add(aCard);
        setImage();
    }
    
    /**
     * Removes the card aCard from this hand if it exists in the hand.
     * 
     * @param aCard a card to be removed from this hand.
     * @returns true if removed; otherwise false.
     */
    public boolean remove(Card aCard){
        boolean isDone = super.remove(aCard);
        setImage();
        return isDone;
    }
    
    /**
     * Makes all the cards in this hand face up.
     */
    public void show()
    {
        Card[] cards = getCards();
        int numOfCards = getSize();
        for(int index = 0; index < numOfCards; index++){
            cards[index].show();
        }
        setImage();
    }
    
    /**
     * Makes all the card in this hand face down.
     */
    public void hide()
    {
        Card[] cards = getCards();
        int numOfCards = getSize();
        for(int index = 0; index < numOfCards; index++){
            cards[index].hide();
        }
        setImage();
    }
    
    /**
     * Act - do whatever the Hand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
