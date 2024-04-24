import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chips here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bronzeChip extends button
{
    /**
     * Act - do whatever the chips wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    String chipType;
    public static Currency balance = new Currency();
    public static int currentBalance = balance.getBalance();
    public static int chipBalance = currentBalance;
    
    
    
    
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
        if(chipBalance>0){
            if(chipType.equals("bronze")){
                chipBalance-=10;
                chipBalance = chipBalance;
            } else if (chipType.equals("silver")) {
                chipBalance-=50;
                chipBalance = chipBalance;
            } else if (chipType.equals("gold")) {
                chipBalance-=100;
                chipBalance = chipBalance;
            } else {
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
                currentBalance-=currentBalance;
                chipBalance = currentBalance;
            }
        }
    }
    
     public void onRightClick(){
        if(chipBalance>0){
            if(chipType.equals("bronze")){
                chipBalance+=10;
                chipBalance = chipBalance;
            } else if (chipType.equals("silver")) {
                chipBalance+=50;
                chipBalance = chipBalance;
            } else if (chipType.equals("gold")) {
                chipBalance+=100;
                chipBalance = chipBalance;
            } else {
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
                currentBalance-=currentBalance;
                chipBalance = currentBalance;
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
    return chipBalance;
}
    }


