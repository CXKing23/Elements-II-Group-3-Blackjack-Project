import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playButton extends button
{
/**
     * Act - do whatever the playButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int count = super.count;
    GreenfootImage image = new GreenfootImage("activeButton.png");
    String background;
    public playButton(){
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Play", 60, 48);
        background = "background1.png";
    }
    public void updateBackground(){
    
        if(this.count == 0){
            background = "background1.png";
            Greenfoot.setWorld(new background(background));
        }else if(this.count == 1){
            background = "background2.png";
            Greenfoot.setWorld(new background(background));
            
        }else if(this.count == 2){
            background = "background3.png";
            Greenfoot.setWorld(new background(background));
            
        }else if(this.count == 3){
            background = "background4.png";
            Greenfoot.setWorld(new background(background));
            
        }
    }
    public void onClick(){
        image = new GreenfootImage("redButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Play", 60, 48);
        Greenfoot.delay(duration);
        GreenfootImage image = new GreenfootImage("activeButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Play", 60, 48);
        updateBackground();
        
        bronzeChip.chipBalance = 1000;
    }
}