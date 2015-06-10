/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package the.maze;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Marc
 */
public class TheMaze extends JFrame {

    public final static int FRAME_WIDTH     = 900;
    public final static int FRAME_HEIGHT    = 600;
    public final static String GAME_TITLE   = "The Maze";
    public static TheMaze ME                = null;
  
    
    
    private void initUI() {
        ME = this;
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle(GAME_TITLE);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Menu menu = new Menu();
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new TheMaze().initUI();
    }
}
