import greenfoot.*;

public class switchButton extends button {
    static int count; 
    public switchButton() {
        super("Switch");
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