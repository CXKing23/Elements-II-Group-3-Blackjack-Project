/**
 * Represents a button to switch between different background images.
 * 
 * This class extends the switchButton class and defines behavior to switch 
 * between different background images based on the count value.
 * 
 * The available background images are:
 * - "background1.png"
 * - "background2.png"
 * - "background3.png"
 * - "background4.png"
 * 
 * The count value determines which background image to display.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class backgrounds extends switchButton
{
    /**
     * Performs the action associated with the background button.
     * 
     * This method is called whenever the 'Act' or 'Run' button is pressed 
     * in the environment. It switches between different background images
     * based on the value of the count variable.
     */
    public void act()
    {
        // Switch between different background images based on the count value
        if(count == 0){
            miniConfig("background1.png");
        } else if(count == 1){
            miniConfig("background2.png");
        } else if(count == 2){
            miniConfig("background3.png");
        } else if(count == 3){
            miniConfig("background4.png");
        }
    }
}
