/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package the.maze;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Marc
 */
public class TheMaze extends JFrame {

    public final static int FRAME_WIDTH    = 600;
    public final static int FRAME_HEIGHT   = 600;
    public final static String GAME_TITLE  = "The Maze";

    
    
    public TheMaze() {
        initUI();
    }
  
    
    
    private void initUI() {
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle(GAME_TITLE);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Menu menu = new Menu(this);
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new TheMaze();
    }
}
