/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package the.maze;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import the.maze.objects.Path;
import the.maze.objects.Player;
import the.maze.objects.Wall;

/**
 *
 * @author Marc
 */
public class Level1 extends JPanel {
   
    // grid onderdelen
    int F = 0; // Free path
    int W = 1; // Wall
    int P = 2; // Player
    int O = 5; // Outer Wall
    
    // 18 cols x 12 rows
    int grid[][]  = {
        {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O},
        {O, P, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, O},
        {O, F, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, O},
        {O, F, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, O},
        {O, F, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, O},
        {O, F, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, O},
        {O, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, O},
        {O, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, O},
        {O, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, O},
        {O, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, O},
        {O, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, W, O},
        {O, O, O, O, O, O, O, O, O, O ,O, O, O, O, O, O, O, O}
    };
    
    public Level1() {
        // keylistener naar parent
        TheMaze.ME.addKeyListener( new MKeyListener() );
        // roept de methode aan waar grid layout wordt toepegast aan JPanel
        addElements();
    }
    
    
    private void addElements() {
     
        // map van level 1
        Object map[][] = new Object[grid.length][grid[0].length];
        // Grid layout
        GridLayout gridLayout = new GridLayout(grid.length, grid[0].length);
        // Wordt toegevoegd aan de JPanel van Level1.class
        setLayout(gridLayout);
        
        // Loop alle rijen langs
        for( int y = 0; y < grid.length; y++ ) {
            
            // Loop alle kolommen langs in elke rij
            for( int x = 0; x < grid[0].length; x++ ) {
                    
                    Color color = null;
                    // vergelijk welk object er in de grid moet toegepast worden
                    switch( grid[y][x] ) {

                        case 0:
                            // free path
                            Path f = new Path( x, y ); // nieuw path object
                            map[y][x] = f; // voeg toe aan map multidimensionale array
                            color = Color.WHITE; // geef als kleur wit terug
                        break;

                        case 1:
                            // wall
                            Wall w = new Wall( x, y );
                            map[y][x] = w;
                            color = Color.GRAY;
                        break;

                        case 2:
                            // player
                            Player p = new Player( x, y );
                            map[y][x] = p;
                            color = Color.BLUE;
                        break;

                        case 5:
                            // outer wall
                            Wall ow = new Wall( x, y, false );
                            map[y][x] = ow;
                            color = Color.BLACK;
                        break;

                    }
                    
                    JButton button = new JButton(); // maak een nieuwe button
                    button.setBackground( color ); // voeg een kleur toe die bij een object wordt toegepast (path, player, wall, etc)
                    add(button); // voeg de button aan de grid toe
                   

            }

        }
      
        // verwijder het menu
        TheMaze.ME.remove(Menu.ME);
        // voeg deze JPanel aan TheMaze JFrame toe
        TheMaze.ME.add(this);
        // opnieuw tekenen
        TheMaze.ME.revalidate();
        
    }
    
    
    class MKeyListener implements KeyListener {
        
        @Override
        public void keyTyped(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void keyPressed(KeyEvent e) {
             if (e.getKeyCode() == 37) { // left
                    JOptionPane.showMessageDialog(TheMaze.ME, "Eggs are not supposed to be green.");
                }

                if (e.getKeyCode() == 38) { // up

                }

                if (e.getKeyCode() == 39) { // rechts

                }

                if (e.getKeyCode() == 40) { // omlaag

                }
        }
    }
    
}