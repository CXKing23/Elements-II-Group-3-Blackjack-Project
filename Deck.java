import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck extends Actor
{
    private Card[] cards;
    private int numOfCards;

    public Deck(){
        cards = new Card[1];
        numOfCards = 0;
    }
    
    public Deck(int numOfDecks){
        numOfCards = numOfDecks*52;
        cards = new Card[numOfCards];
        int index = 0;
        for (int deckCount=0; deckCount < numOfDecks; deckCount++) {
            for(Suit suit: Suit.values()){
                for(Rank rank: Rank.values()){
                    if (rank == Rank.JOKER){
                        continue;
                    }
                    cards[index++] = new Card(rank,suit);
                }
            }
        }
        shuffle();
        if (numOfCards > 0){
            setImage(cards[numOfCards-1].getImage());
        }
    }

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
     * Grows the cards array by doubling the size of the array.
     */
    private void grow(){
        Card[] tempCards = new Card[cards.length*2];
        for(int index=0; index < numOfCards; index++){
            tempCards[index] = cards[index];
        }
        cards = tempCards;
    }

    /**
     * Returns true if this deck is empty; otherwise true.
     */
    public boolean isEmpty(){
        return numOfCards == 0;
    }

    /**
     * Removes the first occurrence of aCard from the deck.  This method
     * will find the first occurrence of a card that has the same suit and
     * rank as aCard and remove it from the deck.
     * 
     * @param aCard an instance of a Card to be removed from the deck.
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
     * Adds a card aCard to this deck.
     * 
     * @param aCard an instance of a Card that is to be added to this deck.
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
     * Deals a card from this deck by returning the top card on this deck.
     * 
     * @param isFaceUp true if you want the card to be dealt face up; otherwise false.
     * @returns an instance of Card from this deck.
     */
    public Card deal(boolean isFaceUp){
        Card topCard = deal();
        if (isFaceUp){
            topCard.show();
        }
        return topCard;
    }
    
    /**
     * Deals a card from this deck by returning the top card on this deck.
     */
    public Card deal(){
        Card topCard = cards[numOfCards-1];
        cards[numOfCards-1] = null;
        numOfCards--;
        return topCard;
    }

    /**
     * Deals cards from this deck to an array of decks giving numOfCardsToDeal to each
     * deck.  If isFaceUp is true, the cards are dealt face up; otherwise face down.
     * 
     * @param deck an array of Deck objects to which cards are dealt.
     * @param numOfCardsToDeal number of cards to deal to each deck.
     * @param isFaceUp if true, the cards are dealt face up; otherwise face down
     */
    public void deal(Deck[] deck, int numOfCardsToDeal, boolean isFaceUp){
        int maxCardCount = numOfCardsToDeal*deck.length;
        for (int cardCount=0; cardCount < maxCardCount; cardCount++){
            Card card = deal(isFaceUp);
            deck[cardCount % deck.length].add(card);
        }
    }
    
    /**
     * Returns the size of this deck.  That is, then number of cards in this deck.
     * 
     * @returns number of cards in this deck.
     */
    public int getSize(){
        return numOfCards;
    }

    /**
     * Returns the array of cards in this deck.
     * 
     * @returns a reference to the array of cards in this deck.
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
     * Act - do whatever the Deck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
