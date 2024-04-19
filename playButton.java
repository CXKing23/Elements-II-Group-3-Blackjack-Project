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
    GreenfootImage image = new GreenfootImage("activeButton.png");
    public playButton(){
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Play", 60, 48);
    }
    public void onClick(){
    image= new GreenfootImage("redButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Play", 60, 48);
        Greenfoot.delay(75);
        GreenfootImage image = new GreenfootImage("activeButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Play", 60, 48);
        if(count == 0){
            Greenfoot.setWorld(new background("background1.png"));
            
        }else if(count == 1){
            Greenfoot.setWorld(new background("background2.png"));
            
        }else if(count == 2){
            Greenfoot.setWorld(new background("background3.png"));
            
        }else if(count == 3){
            Greenfoot.setWorld(new background("background4.png"));
            
    }
}
}