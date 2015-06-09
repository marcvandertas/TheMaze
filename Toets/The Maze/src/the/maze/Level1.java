/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package the.maze;

import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import the.maze.objects.Path;
import the.maze.objects.Player;
import the.maze.objects.Wall;

/**
 *
 * @author Marc
 */
public class Level1 extends JPanel {
    TheMaze parent;
    
    
    int F = 0; // Free path
    int W = 1; // Wall
    int P = 2; // Player
    int O = 5; // Outer Wall
    
    // 18 cols x 12 rows
    int grid[][]  = {
        {W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W},
        {W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W},
        {W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W},
        {W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W},
        {W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W},
        {W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W},
        {W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W},
        {W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W},
        {W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W},
        {W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W},
        {W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W},
        {W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W}
    };
    
    public Level1( TheMaze parent ) {
        this.parent = parent;
        addElements();
    }
    
    
    private void addElements() {
     
        
        Object map[][] = new Object[grid.length][grid[0].length];
        GridLayout gridLayout = new GridLayout(grid.length, grid[0].length);
        setLayout(gridLayout);
        for( int y = 0; y < grid.length; y++ ) {

            for( int x = 0; x < grid[0].length; x++ ) {
                    
                    JLabel label = new JLabel();
                    String name = null;
                    
                    switch( grid[y][x] ) {

                        case 0:
                            // free path
                            Path f = new Path( x, y );
                            map[y][x] = f;
                            name = " ";
                        break;

                        case 1:
                            // wall
                            Wall w = new Wall( x, y );
                            map[y][x] = w;
                            name = "w";
                        break;

                        case 2:
                            // player
                            Player p = new Player( x, y );
                            map[y][x] = p;
                            name = "p";
                        break;

                        case 5:
                            // outer wall
                            Wall ow = new Wall( x, y, false );
                            map[y][x] = ow;
                            name = "o";
                        break;

                    }
                    
                    label = new JLabel( name );
                    add(label);
                   

            }

        }
      
    
        parent.add(this);
        parent.revalidate();
        
    }
    
    
    
}
