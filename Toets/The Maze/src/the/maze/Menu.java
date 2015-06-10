/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package the.maze;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Marc
 */
public class Menu extends JPanel implements ActionListener {

     JButton button = new JButton("start");
     public static Menu ME;
    
    public Menu() {
        
        addElements();
    }
    
    
    private void addElements() {
        ME = this;
        button.addActionListener(this);
        add(button);
        TheMaze.ME.add(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object src = e.getSource();
        
        if (src == button) {

            //JOptionPane.showMessageDialog(parent, "Eggs are not supposed to be green.");
            Level1 level_1 = new Level1();
            
        }
        
    }
    
    
    
}
