
package project;

import java.awt.AWTException;
import java.io.IOException;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

public class Project extends Mid implements org.jnativehook.mouse.NativeMouseInputListener{
main m = new main();


    public static void setX(int aX) {
        x = aX;
    }
    public static int getY() {
        return y;
    }
    public static int getx() {
        return x;
    }
    public static void setY(int aY) {
        y = aY;
    }
    private static int x;
    private static int y;


	public void nativeMouseClicked(org.jnativehook.mouse.NativeMouseEvent e) {
		System.out.println("Mouse Clicked: " + e.getClickCount());
	}

	public void nativeMousePressed(org.jnativehook.mouse.NativeMouseEvent e) {
		System.out.println("Mouse Pressed: " + e.getButton());
	}

	public void nativeMouseReleased(org.jnativehook.mouse.NativeMouseEvent e) {
		System.out.println("Mouse Released: " + e.getButton());
	}

	public void nativeMouseMoved(org.jnativehook.mouse.NativeMouseEvent e) {
		System.out.println("Mouse Moved: " + e.getX() + ", " + e.getY());
                s.setX(e.getX());
                s.setY(e.getY());

if(e.getX()>=1919){
System.out.print("out");
r.mouseMove(1,e.getY());
out = true;
LastX = e.getX();
LastY = e.getY();
if(frame.isVisible()==false){
    showOverlay();
    }

            



}
if(out==true){
                try {

        s.send();
    } catch (IOException ex) {
        Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
    }
}
if(e.getX()<0&& e.getX()>-10){
    hideOverlay();


}


                
}
        

	public void nativeMouseDragged(org.jnativehook.mouse.NativeMouseEvent e) {
		System.out.println("Mouse Dragged: " + e.getX() + ", " + e.getY());
	}

	public static void main() throws AWTException {
            
            
            

      
Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
logger.setLevel(Level.OFF);


Handler[] handlers = Logger.getLogger("").getHandlers();
for (int i = 0; i < handlers.length; i++) {
	handlers[i].setLevel(Level.OFF);
}
            
            
		try {
			GlobalScreen.registerNativeHook();
		}
		catch (NativeHookException ex) {
			System.err.println("There was a problem registering the native hook.");
			System.err.println(ex.getMessage());

			System.exit(1);
		}

		
		Project thisC = new Project();

		GlobalScreen.addNativeMouseListener(thisC);
		GlobalScreen.addNativeMouseMotionListener(thisC);
                
	}
}
