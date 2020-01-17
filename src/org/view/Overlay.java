/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;


/**
 *
 * @author User
 */
public class Overlay {
    protected static JFrame frame = new JFrame("overlay");
    protected Toolkit toolkit;
    protected Point siz;
    protected Cursor invisibleCursor;
    protected Cursor normalCursor;
    
    protected void runInit(){
    toolkit = Toolkit.getDefaultToolkit();
    siz = new Point(0,0);
    BufferedImage cursorImage = new BufferedImage(1, 1, BufferedImage.TRANSLUCENT); 
    invisibleCursor = toolkit.createCustomCursor(cursorImage, siz, "InvisibleCursor");
    normalCursor = new Cursor(Cursor.DEFAULT_CURSOR);
frame.setType(javax.swing.JFrame.Type.UTILITY);            
frame.setExtendedState(frame.MAXIMIZED_BOTH);
frame.setLocation(0,0);
frame.setUndecorated(true);
frame.setBackground(new Color(1.0f,1.0f,1.0f,0.01f));
frame.setCursor(invisibleCursor);
frame.setAlwaysOnTop(true);
    
    }
    protected void showOverlay(){
    frame.setVisible(true);
    }
    
    protected void hideOverlay(){
    frame.setVisible(false);
    }
    
    protected boolean isoverlay(){
    
    return frame.isVisible();
    }
    
    
}
