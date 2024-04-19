import greenfoot.*;

public class switchButton extends button 
{
    //GreenfootImage image = new GreenfootImage("redButton.png");
    public switchButton(){
        image.scale(170,80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Switch", 50, 48);

    }

    public void onClick() {
        count++; 
        if(count == 4){
            count = 0;
        }
    }
    public static int getCount() {
        return count;
    }

}