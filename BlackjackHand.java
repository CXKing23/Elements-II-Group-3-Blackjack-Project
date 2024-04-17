import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackjackHand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackjackHand extends Hand
{   public static final int BLACKJACK = 22;
    public static final int BUST = -1;

    private int weight;

    /**
     * Constructor that initializes this blackjack hand and sets the name.
     * 
     * @param name the name of the blackjack instance.
     */
    public BlackjackHand(String name){
        super(name);
        weight = 0;
    }

    /**
     * Returns the weight of the card based on the rules of Blackjack.
     */
    private int getWeight(Rank rank){
        // NOTE: This can be implemented with an multibranch if-else statement.
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
     * Calculates the weight of this blackjack hand based on the cards that are face up.
     */
    private void calculateWeight(){
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
                if (11+Math.max(weight[0],weight[1]) > 21){
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
     * Returns the weight of this blackjack hand.
     * 
     * @returns an integer representing the weight of this blackjack hand.
     */
    public int getWeight()
    {
        return weight;
    }

    /**
     * Adds a card aCard to this blackjack hand.
     * 
     * @param aCard a card to be added to this blackjack hand.
     */
    @Override
    public void add(Card aCard)
        {
        super.add(aCard);
        calculateWeight();
        showWeight();
    }
    
    /**
     * Makes all the cards in this blackjack hand face up.
     */
    @Override
    public void show()
    {
        super.show();
        calculateWeight();
        showWeight();
    }
    
    /**
     * Makes all the card in this hand face down.
     */
    @Override
    public void hide()
    {
        super.hide();
        calculateWeight();
    }
    
    /**
     * Removes the card aCard from this blackjack hand if it exists in the hand.
     * 
     * @param aCard a card to be removed from this blackjack hand.
     * @returns true if removed; otherwise false.
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
     * Adds the weight information for this blackjack hand to the image of the hand.
     */
    protected void showWeight()
    {
        if (weight != 0) {
            GreenfootImage image = getImage();
            GreenfootImage newImage = new GreenfootImage(image.getWidth(), image.getHeight() + 30);
            newImage.setFont(new Font(true, false, 22));
            newImage.setColor(Color.WHITE);
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
