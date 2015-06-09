/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package the.maze.objects;

/**
 *
 * @author Marc
 */
public class Wall extends GameObject {
    
    private boolean isDestroyable = true;
    public static String IMAGE_NAME = "wall.png";

    public Wall( int x, int y ) {
        this.x = x;
        this.y = y;
    }
    
    public Wall( int x, int y, boolean isDestroyable ) {
        this.isDestroyable = isDestroyable;
        if( !isDestroyable ) {
            IMAGE_NAME = "ow.png";
        }
        this.x = x;
        this.y = y;
    }
    
    
    
}