import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chips here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bronzeChip extends button
{

    String chipType;
    private static final int BRONZE_CHIP_VALUE = 10;
    private static final int SILVER_CHIP_VALUE = 50;
    private static final int GOLD_CHIP_VALUE = 100;
    private static final int startingBalance = 10000;

    public static Currency balance = new Currency();
    public static int currentBalance = startingBalance;
    public static int betBalance = 0;

    /**
     * Constructor that initializes this blackjack hand and sets the name.
     * 
     * @param filename the filename for the image
     */
    public bronzeChip(String filename) {
        super(filename);
        if (filename.equals("Chips/bronze_chip.png")) {
            chipType = "bronze";
        } else if (filename.equals("Chips/silver_chip.png")) {
            chipType = "silver";
        } else if (filename.equals("Chips/gold_chip.png")) {
            chipType = "gold";
        }else{
            image= new GreenfootImage("activeButton.png");
            image.scale(170,80);
            image.setColor(Color.BLACK); 
            image.setFont(new Font("Arial", true, false, 24));
            image.drawString("All In", 55, 48);
            setImage(image);
            chipType = "All In";
        }
    }

    public void onLeftClick(){
        if(currentBalance>0){
            if(chipType.equals("bronze") && (currentBalance - BRONZE_CHIP_VALUE >= 0 )){

                betBalance+=BRONZE_CHIP_VALUE;
                currentBalance-=BRONZE_CHIP_VALUE;
                betBalance = betBalance;
            } else if (chipType.equals("silver") && (currentBalance  - SILVER_CHIP_VALUE >= 0)) {
                betBalance+=SILVER_CHIP_VALUE;
                currentBalance-=SILVER_CHIP_VALUE;
                betBalance = betBalance;
            } else if (chipType.equals("gold") && (currentBalance  - GOLD_CHIP_VALUE >= 0)) {
                betBalance+=GOLD_CHIP_VALUE;
                currentBalance-=GOLD_CHIP_VALUE;
                betBalance = betBalance;
            } else if (chipType.equals("All In")) {
                image= new GreenfootImage("redButton.png");
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
                betBalance+=currentBalance;
                currentBalance=0;
            }
        }
    }

    public void onRightClick(){
            if(betBalance>0){
                if(chipType.equals("bronze") && (betBalance - BRONZE_CHIP_VALUE >= 0 )){
                    betBalance-=BRONZE_CHIP_VALUE;
                    currentBalance+=BRONZE_CHIP_VALUE;
                    betBalance = betBalance;
                } else if (chipType.equals("silver")&& (betBalance  - SILVER_CHIP_VALUE >= 0)) {
                    betBalance-=SILVER_CHIP_VALUE;
                    currentBalance+=SILVER_CHIP_VALUE;
                    betBalance = betBalance;
                } else if (chipType.equals("gold")&& (betBalance  - GOLD_CHIP_VALUE >= 0)) {
                    betBalance-=GOLD_CHIP_VALUE;
                    currentBalance+=GOLD_CHIP_VALUE;
                    betBalance = betBalance;
                } else if (chipType.equals("All In")) {
                    image= new GreenfootImage("redButton.png");
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
                    currentBalance+=betBalance;
                    betBalance = 0;
                }
            }
        }

    public void act() {
        if (Greenfoot.mousePressed(this) && (Greenfoot.getMouseInfo().getButton() == 1)) {
            onLeftClick();
        }
        else if (Greenfoot.mousePressed(this) && (Greenfoot.getMouseInfo().getButton() == 3)) {
            onRightClick();
        }
    }

    public static int getBalance(){
        return currentBalance;
    }

    public static int getbetBalance(){
        return betBalance;
    }
}


