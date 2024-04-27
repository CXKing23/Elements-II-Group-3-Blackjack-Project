import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class representing a hand in the game of Blackjack.
 * This class extends the Hand class and provides additional methods specific to Blackjack, such as calculating the weight of the hand based on Blackjack rules.
 * 
 * It includes methods for adding cards to the hand, calculating the weight of the hand, and showing the weight information on the image of the hand.
 * 
 * It also overrides methods from the Hand class to ensure proper calculation and display of the weight.
 * 
 * Additionally, it includes a method to add a card from a deck to the hand, avoiding special cards for the dealer's hand.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class BlackjackHand extends Hand
{
    public static final int BLACKJACK = 22; // Constant representing Blackjack score
    public static final int BUST = -1;       // Constant representing Bust score

    private int weight; // Variable to store the weight of the hand

    /**
     * Constructor for creating a Blackjack hand with the specified name.
     * 
     * @param name The name of the Blackjack hand instance.
     */
    public BlackjackHand(String name){
        super(name);
        weight = 0;
    }

    /**
     * Returns the weight of a card based on the rules of Blackjack.
     * 
     * @param rank The rank of the card.
     * @return The weight of the card.
     */
    private int getWeight(Rank rank){
        switch(rank){
            case ACE:
                return 11;
            case TWO:
            case THREE:
            case FOUR:
            case FIVE:
            case SIX:
            case SEVEN:
            case EIGHT:
            case NINE:
                return rank.getRank();
            case TEN:
            case JACK:
            case QUEEN:
            case KING:
                return 10;
            default:
                return 0;
        }
    }

    /**
     * Calculates the weight of the Blackjack hand based on the cards that are face up.
     */
    public void calculateWeight(){
        int[] weight = {0, 0};
        Card[] cards = getCards();
        int numOfCards = getSize();

        for(int index = 0; index < numOfCards; index++){
            if (!cards[index].isFaceUp()){
                continue;  // if the card is face down don't include in weight
            }
            int currentCardValue = getWeight(cards[index].getRank());
            if (cards[index].getRank() != Rank.ACE){
                weight[0] += currentCardValue;
                weight[1] += currentCardValue;
            } else {
                if (11 + Math.max(weight[0],weight[1]) > 21){
                    int minWeight = Math.min(weight[0],weight[1]);
                    weight[0] = 1 + minWeight;
                    weight[1] = 11 + minWeight;
                } else {
                    weight[0] += 1;
                    weight[1] += 11;
                }
            }
        }
        // calculate the weight of the hand
        this.weight = Math.max(weight[0],weight[1]);
        if (this.weight > 21){
            this.weight = Math.min(weight[0],weight[1]);
        }
        // check for Blackjack or Bust
        if (this.weight > 21){
            this.weight = BUST;
        } else if (getSize() == 2 && this.weight == 21){
            this.weight = BLACKJACK;
        }
    }
    
    /**
     * Returns the weight of this Blackjack hand.
     * 
     * @return The weight of this Blackjack hand.
     */
    public int getWeight()
    {
        return weight;
    }

    /**
     * Adds a card to this Blackjack hand and calculates the new weight.
     * 
     * @param aCard The card to be added to this Blackjack hand.
     */
    @Override
    public void add(Card aCard)
    {
        super.add(aCard);
        calculateWeight();
        showWeight();
    }
    
    /**
     * Adds a card from a deck to this Blackjack hand and calculates the new weight.
     * This method avoids adding special cards to the dealer's hand.
     * 
     * @param aDeck The deck from which to draw a card.
     * @param isFaceUp True if the card should be face up, false otherwise.
     */
    public void addCardFromDeck(Deck aDeck, boolean isFaceUp)
    {
        if (this.name.equals("dHand")){
            Card aCard = aDeck.deal(isFaceUp);
            while (aCard.isSpecial()){
                aCard = aDeck.deal(isFaceUp);
            }
            super.add(aCard);    
        } else {
            super.add(aDeck.deal());
        }   
        calculateWeight();
        showWeight();
    }
    
    /**
     * Shows all the cards in this Blackjack hand face up and calculates the weight.
     */
    @Override
    public void show()
    {
        super.show();
        calculateWeight();
        showWeight();
    }
    
    /**
     * Hides all the cards in this Blackjack hand and calculates the weight.
     */
    @Override
    public void hide()
    {
        super.hide();
        calculateWeight();
    }
    
    /**
     * Removes a card from this Blackjack hand and calculates the new weight.
     * 
     * @param aCard The card to be removed from this Blackjack hand.
     * @return True if the card was removed, false otherwise.
     */
    public boolean remove(Card aCard){
        boolean isRemoved = super.remove(aCard);
        if (isRemoved){
            calculateWeight();
            showWeight();
        }
        return isRemoved;
    }
    
    /**
     * Adds weight information for this Blackjack hand to the image of the hand.
     */
    protected void showWeight()
    {
        if (weight != 0) {
            GreenfootImage image = getImage();
            GreenfootImage newImage = new GreenfootImage(image.getWidth(), image.getHeight() + 30);
            newImage.setFont(new Font(true, false, 30));
            newImage.setColor(Color.BLACK);
            newImage.drawImage(image,0,0);
            String value = weight + "";
            int pos = 20;
            if (weight == BLACKJACK){
                value = "Blackjack!";
            } else if (weight == BUST){
                value = "Bust!";
            }
            pos = 30 + value.length();
            newImage.drawString(value, 0, image.getHeight()+20);
            setImage(newImage);
        }
    }
    
    /**
     * Act - do whatever the BlackjackHand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
