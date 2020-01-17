
package project;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;




public class socket {

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

private volatile int x;     //multithreading loop
private volatile int y;




    public void send() throws IOException{
   ServerSocket listener = new ServerSocket(9090);
   //listener.setPerformancePreferences(1, 1, 1);
  
   
    try {
        
            Socket socket = listener.accept();
            try {
                
                //PrintWriter out =
                    new PrintWriter(socket.getOutputStream(), true);
                //out.println(this.getX()+","+this.getY());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                out.writeInt(this.getX());
                out.writeInt(this.getY());
               
            } finally {
               socket.close();
            }
        
    }
    finally {
        listener.close();
    }
}
    }

