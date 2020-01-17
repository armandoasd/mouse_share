
package project;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.view.Overlay;

public class Mid extends Overlay{
    protected boolean out = false;
    protected Robot r;
    protected socket s;

    protected int LastX=0;
    protected int LastY=0;
    
    
    public Mid(){
        runInit();
        s = new socket();
        try {
            this.r = new Robot();
        } catch (AWTException ex) {
            Logger.getLogger(Mid.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
