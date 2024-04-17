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
    public int numOfCards;
    private static final int witchCardCount = 2;
    private static final int ftCardCount = 2;
    
    
    public void grow(){
        Card[] tempCards = new Card[cards.length * 2];
        for(int index = 0; index < numOfCards; index ++){
            tempCards[index] = cards[index];
        }
        cards = tempCards;
    }
    
    public Deck(int numOfDecks){
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
    
    public boolean isEmpty(){
        return numOfCards == 0;
    }

    public boolean remove(Card aCard){
        // TODO: Need to implement
        return false;
    }

    public void add(Card aCard){
        if (numOfCards >= cards.length){
            grow();
        } else {
            cards[numOfCards] = aCard;
        }
    }
    
    public Card deal(boolean isFaceUp){
        Card topCard = cards[numOfCards - 1];
        cards[numOfCards - 1] = null;
        numOfCards --;
        return topCard;
    }
    
    public void deal(Deck[] deck, int numOfCardsToDeal, boolean isFaceUp){
        int maxCardCount = numOfCardsToDeal * deck.length;
        for (int cardCount = 0; cardCount < maxCardCount; cardCount ++){
            Card card = deal(isFaceUp);
            deck[cardCount % deck.length].add(card);
        }
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
