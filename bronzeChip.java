import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Represents a chip used for betting in the game.
 * 
 * This class extends the button class and defines behavior for chips used 
 * in betting. It allows players to place bets by left-clicking and remove 
 * bets by right-clicking. The chip type (bronze, silver, gold, or All In) 
 * determines the amount of the bet.
 * 
 * The chip values are as follows:
 * - Bronze Chip: 10
 * - Silver Chip: 50
 * - Gold Chip: 100
 * 
 * The chip types are identified based on the filename of the chip image.
 * 
 * The chip behavior is as follows:
 * - Left-clicking on a chip adds the corresponding bet amount to the current bet balance.
 * - Right-clicking on a chip removes the corresponding bet amount from the current bet balance.
 * 
 * If the chip type is "All In", left-clicking bets the entire current balance, and right-clicking 
 * returns the entire bet balance back to the current balance.
 * 
 * The current balance and bet balance are tracked and updated accordingly.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class bronzeChip extends button
{
    public String chipType;
    private static final int BRONZE_CHIP_VALUE = 10;
    private static final int SILVER_CHIP_VALUE = 50;
    private static final int GOLD_CHIP_VALUE = 100;
    private static final int startingBalance = 10000;

    public static Currency balance = new Currency();
    public static int currentBalance = startingBalance;
    public static int betBalance = 0;

    /**
     * Constructor that initializes a bronze chip with the given filename.
     * 
     * @param filename the filename of the chip image.
     */
    public bronzeChip(String filename) {
        super(filename);
        if (filename.equals("Chips/bronze_chip.png")) {
            chipType = "bronze";
        } else if (filename.equals("Chips/silver_chip.png")) {
            chipType = "silver";
        } else if (filename.equals("Chips/gold_chip.png")) {
            chipType = "gold";
        } else {
            // All In chip
            image = new GreenfootImage("activeButton.png");
            image.scale(170,80);
            image.setColor(Color.BLACK); 
            image.setFont(new Font("Arial", true, false, 24));
            image.drawString("All In", 55, 48);
            setImage(image);
            chipType = "All In";
        }
    }

    /**
     * Performs the action associated with a left click on the chip.
     */
    public void onLeftClick(){
        if (currentBalance > 0) {
            if (chipType.equals("bronze") && (currentBalance - BRONZE_CHIP_VALUE >= 0)) {
                betBalance += BRONZE_CHIP_VALUE;
                currentBalance -= BRONZE_CHIP_VALUE;
            } else if (chipType.equals("silver") && (currentBalance  - SILVER_CHIP_VALUE >= 0)) {
                betBalance += SILVER_CHIP_VALUE;
                currentBalance -= SILVER_CHIP_VALUE;
            } else if (chipType.equals("gold") && (currentBalance  - GOLD_CHIP_VALUE >= 0)) {
                betBalance += GOLD_CHIP_VALUE;
                currentBalance -= GOLD_CHIP_VALUE;
            } else if (chipType.equals("All In")) {
                image = new GreenfootImage("redButton.png");
                image.scale(170,80);
                setImage(image);
                image.setColor(Color.BLACK); 
                image.setFont(new Font("Arial", true, false, 24));
                image.drawString("All In", 55, 48);
                Greenfoot.delay(duration);
                GreenfootImage image = new GreenfootImage("activeButton.png");
                image.scale(170,80);
                setImage(image);
                image.setColor(Color.BLACK); 
                image.setFont(new Font("Arial", true, false, 24));
                image.drawString("All In", 55, 48); 
                betBalance += currentBalance;
                currentBalance = 0;
            }
        }
    }

    /**
     * Performs the action associated with a right click on the chip.
     */
    public void onRightClick(){
        if (betBalance > 0) {
            if (chipType.equals("bronze") && (betBalance - BRONZE_CHIP_VALUE >= 0)) {
                betBalance -= BRONZE_CHIP_VALUE;
                currentBalance += BRONZE_CHIP_VALUE;
            } else if (chipType.equals("silver") && (betBalance  - SILVER_CHIP_VALUE >= 0)) {
                betBalance -= SILVER_CHIP_VALUE;
                currentBalance += SILVER_CHIP_VALUE;
            } else if (chipType.equals("gold") && (betBalance  - GOLD_CHIP_VALUE >= 0)) {
                betBalance -= GOLD_CHIP_VALUE;
                currentBalance += GOLD_CHIP_VALUE;
            } else if (chipType.equals("All In")) {
                image = new GreenfootImage("redButton.png");
                image.scale(170,80);
                setImage(image);
                image.setColor(Color.BLACK); 
                image.setFont(new Font("Arial", true, false, 24));
                image.drawString("All In", 55, 48);
                Greenfoot.delay(duration);
                GreenfootImage image = new GreenfootImage("activeButton.png");
                image.scale(170,80);
                setImage(image);
                image.setColor(Color.BLACK); 
                image.setFont(new Font("Arial", true, false, 24));
                image.drawString("All In", 55, 48);    
                currentBalance += betBalance;
                betBalance = 0;
            }
        }
    }

    /**
     * Handles mouse click events on the chip.
     */
    public void act() {
        if (Greenfoot.mousePressed(this) && (Greenfoot.getMouseInfo().getButton() == 1)) {
            onLeftClick();
        } else if (Greenfoot.mousePressed(this) && (Greenfoot.getMouseInfo().getButton() == 3)) {
            onRightClick();
        }
    }

    /**
     * Retrieves the current balance.
     * 
     * @return the current balance.
     */
    public static int getBalance(){
        return currentBalance;
    }

    /**
     * Retrieves the current bet balance.
     * 
     * @return the current bet balance.
     */
    public static int getbetBalance(){
        return betBalance;
    }
}
