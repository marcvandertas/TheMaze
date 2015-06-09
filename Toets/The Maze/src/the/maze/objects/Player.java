/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package the.maze.objects;

/**
 *
 * @author Marc
 */
public class Player extends GameObject{

    public final static String IMAGE_NAME = "player.png";
    
    public Player( int x, int y ) {
        this.x = x;
        this.y = y;
    }
    
}