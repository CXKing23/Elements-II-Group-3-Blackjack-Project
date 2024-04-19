import greenfoot.*;

public class switchButton extends button 
{

    public switchButton(){
        GreenfootImage image = new GreenfootImage("activeButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Switch", 50, 48);

    }

    public void onClick() {
        count++; 
        image= new GreenfootImage("redButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Switch", 50, 48);
        Greenfoot.delay(75);
        GreenfootImage image = new GreenfootImage("activeButton.png");
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Switch", 50, 48);

        if(count == 4){
            count = 0;
        }
    }
    public static int getCount() {
        return count;
    }

}