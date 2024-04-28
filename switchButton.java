import greenfoot.*;

/**
 * Represents a button for switching between different options or states.
 * 
 * This class extends the button class and defines the behavior of the switchButton.
 * When clicked, it increments a count and changes its appearance accordingly.
 * 
 * The count can be retrieved using the static getCount method.
 * 
 * @author (Your Name)
 * @version (Version Number or Date)
 */
public class switchButton extends button 
{
    public static int count = 0; // Initialize count
    
    /**
     * Constructor for creating a switchButton.
     * Initializes the button with the default appearance and text.
     */
    public switchButton(){
        GreenfootImage image = new GreenfootImage("activeButton.png");
        image.scale(170, 80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Switch", 50, 48);
    }

    /**
     * Defines the behavior of the switchButton when clicked.
     * Increments the count and changes the appearance of the button when clicked.
     */
    public void onClick() {
        // Increment the count and loop back to 0 if it reaches 4
        count++; 
        if(count == 4){
            count = 0;
        }
        
        // Change the appearance of the button when clicked
        GreenfootImage image = new GreenfootImage("redButton.png");
        image.scale(170, 80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Switch", 50, 48);
        
        // Add a delay to show the clicked state
        Greenfoot.delay(duration);
        
        // Restore the original appearance of the button
        image = new GreenfootImage("activeButton.png");
        image.scale(170, 80);
        setImage(image);
        image.setColor(Color.BLACK); 
        image.setFont(new Font("Arial", true, false, 24));
        image.drawString("Switch", 50, 48);
    }
    
    /**
     * Retrieves the current count.
     * 
     * @return the current count
     */
    public static int getCount() {
        return count;
    }

}
