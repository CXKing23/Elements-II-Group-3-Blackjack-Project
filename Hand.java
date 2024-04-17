import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hand extends Deck
{
    private String name;
    
    public Hand(String name){
        super(0);
        this.name = name;
    }
    
    public Card throwCard(){
        return deal(super.numOfCards > 0);
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
