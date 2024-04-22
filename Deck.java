import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Class representing a deck of playing cards.
 * This class allows for creating, shuffling, dealing, and manipulating a deck of cards.
 * 
 * It contains methods for adding and removing cards, shuffling the deck, dealing cards, and checking if the deck is empty.
 * 
 * Additionally, it provides methods to deal cards face-up or face-down and to deal cards to multiple decks.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class Deck extends Actor
{
    private Card[] cards;              // Array to hold the cards in the deck
    protected int numOfCards;          // Number of cards currently in the deck
    private static final int witchCardCount = 2; // Number of witch cards in the deck
    private static final int ftCardCount = 2;    // Number of Fortune Teller cards in the deck
    private GreenfootImage backImage;  // Image for the back of the cards
    
    /**
     * Constructor for creating an empty deck.
     * Initializes the cards array with a single slot and sets the number of cards to zero.
     */
    public Deck(){
        cards = new Card[1];
        numOfCards = 0; 
    }
    
    /**
     * Method to grow the size of the cards array.
     * Doubles the size of the array to accommodate more cards.
     */
    protected void grow(){
        Card[] tempCards = new Card[cards.length * 2];
        for(int index = 0; index < numOfCards; index ++){
            tempCards[index] = cards[index];
        }
        cards = tempCards;
    }
    
    /**
     * Constructor for creating a deck with a specified number of decks.
     * Initializes the deck with standard playing cards, witches, and Fortune Teller cards.
     * Shuffles the deck afterwards.
     * 
     * @param numOfDecks The number of standard decks to include in the deck.
     */
    public Deck(int numOfDecks){
        backImage = new GreenfootImage("BackOfCards.png");
        numOfCards = numOfDecks*(52+witchCardCount+ftCardCount);
        cards = new Card[numOfCards];
        int index = 0;
        for (int deckCount=0; deckCount < numOfDecks; deckCount++) {
            for(Suit suit: Suit.values()){
                if (suit.equals(Suit.SPECIAL)){
                    continue;
                }
                
                for(Rank rank: Rank.values()){
                    if ((rank == Rank.JOKER)|| (rank == Rank.WITCH) || (rank == Rank.FT)){
                        continue;
                    }
                    cards[index++] = new Card(rank,suit);
                }
            }
            for(int cardCount = 0; cardCount < ftCardCount; cardCount++){
                cards[index++] = new Card(Rank.FT,Suit.SPECIAL);
            }
            for(int cardCount = 0; cardCount < witchCardCount; cardCount++){
                cards[index++] = new Card(Rank.WITCH,Suit.SPECIAL);
            }
        }
        shuffle(); // Shuffle the deck after initialization
        if (numOfCards > 0){
            setImage(cards[numOfCards-1].getImage());
        }
    }

    /**
     * Method to shuffle the cards in the deck.
     * Uses the Fisher-Yates shuffle algorithm to randomize the order of cards.
     */
    public void shuffle(){
        Random rand = new Random();
        for(int index = 0; index < numOfCards-1; index++){
            int swapIndex = rand.nextInt(numOfCards-index) + index;
            Card temp = cards[index];
            cards[index] = cards[swapIndex];
            cards[swapIndex] = temp;
        }
    }

    /**
     * Method to check if the deck is empty.
     * 
     * @return True if the deck is empty, false otherwise.
     */
    public boolean isEmpty(){
        return numOfCards == 0;
    }

    /**
     * Method to remove a specified card from the deck.
     * 
     * @param aCard The card to be removed from the deck.
     * @return True if the card was found and removed, false otherwise.
     */
    public boolean remove(Card aCard){
        boolean isFound = false;
        for(int index = 0; index < numOfCards; index++){
            if (isFound){
                cards[index-1] = cards[index];
            } else {
                if (cards[index].equals(aCard)){
                    isFound = true;
                }
            }
        }
        if (isFound){
            numOfCards--;
            cards[numOfCards] = null;
            setImage(cards[numOfCards-1].getImage());
        }
        return isFound;
    }

    /**
     * Method to add a card to the deck.
     * If the deck is full, it will grow the size of the cards array before adding the card.
     * 
     * @param aCard The card to be added to the deck.
     */
    public void add(Card aCard){
        if (numOfCards >= cards.length){
            grow();
        }
        cards[numOfCards] = aCard;
        numOfCards++;
        if (numOfCards > 0){
            setImage(cards[numOfCards-1].getImage());
        }
    }

    /**
     * Method to deal a card from the deck.
     * 
     * @param isFaceUp True if the card should be dealt face-up, false otherwise.
     * @return The card dealt from the deck.
     */
    public Card deal(boolean isFaceUp){
        Card topCard = deal();
        if (isFaceUp){
            topCard.show();
        }
        return topCard;
    }
    
    /**
     * Method to deal a card from the deck.
     * 
     * @return The card dealt from the deck.
     */
    public Card deal(){
        Card topCard = cards[numOfCards-1];
        cards[numOfCards-1] = null;
        numOfCards--;
        return topCard;
    }

    /**
     * Method to deal cards from the deck to an array of decks.
     * 
     * @param deck An array of Deck objects to which cards are dealt.
     * @param numOfCardsToDeal Number of cards to deal to each deck.
     * @param isFaceUp True if the cards should be dealt face-up, false otherwise.
     */
    public void deal(Deck[] deck, int numOfCardsToDeal, boolean isFaceUp){
        int maxCardCount = numOfCardsToDeal*deck.length;
        for (int cardCount=0; cardCount < maxCardCount; cardCount++){
            Card card = deal(isFaceUp);
            deck[cardCount % deck.length].add(card);
        }
    }
    
    /**
     * Method to get the size of the deck.
     * 
     * @return The number of cards in the deck.
     */
    public int getSize(){
        return numOfCards;
    }

    /**
     * Method to get the array of cards in the deck.
     * 
     * @return A reference to the array of cards in the deck.
     */
    protected Card[] getCards(){
        return cards;    
    }
    
    @Override
    public String toString() {
        String str = "";
        for(Card c: cards){
            if (str.length() > 0){
                str +=", ";
            }
            str += c;
        }
        return str;
    }

    /**
     * Act method.
     * This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
