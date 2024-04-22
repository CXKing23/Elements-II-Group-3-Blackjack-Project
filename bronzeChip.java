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
    static Currency balance = new Currency();
    static int currentBalance = balance.getBalance();
    static int chipBalance = currentBalance;
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
    
    public void onClick(){
    if(currentBalance>0){
        if(chipType.equals("bronze")){
            currentBalance = currentBalance-=10;
            chipBalance = currentBalance;
        } else if (chipType.equals("silver")) {
          currentBalance-=50;
          chipBalance = currentBalance;
    } else if (chipType.equals("gold")) {
        currentBalance-=100;
        chipBalance = currentBalance;
    }else{
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
        
public static int getBalance(){
    return chipBalance;
}
    }


