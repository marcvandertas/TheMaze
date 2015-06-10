/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package the.maze.objects;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Marc
 */
public class Player {

    public final static String IMAGE_NAME = "player.png";
    private int x;
    private int y;
    
    public Player( int x, int y ) {
        this.x = x;
        this.y = y;
    }
    
    
    /**
     * GET X
     */
    public int getX() {
        return x;
    }

    
    /**
     * SET X
     */
    public void setX(int x) {
        this.x = x;
    }

    
    /**
     * GET Y
     */
    public int getY() {
        return y;
    }

    
    /**
     * SET Y
     */
    public void setY(int y) {
        this.y = y;
    }
}