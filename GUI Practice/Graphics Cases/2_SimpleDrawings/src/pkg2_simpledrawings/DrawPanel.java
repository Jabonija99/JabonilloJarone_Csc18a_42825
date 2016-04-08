//Uses drawLine to connect the corners of the panel

package pkg2_simpledrawings;

import java.awt.Graphics; //import graphics for text and shapes
import javax.swing.JPanel; //import canvas to draw


public class DrawPanel extends JPanel {
    //Draws an X from the corners of the panel
    public void paintComponent(Graphics g){
        //Calls paintComponent to ensure the panel displays correctly
        super.paintComponent(g);
        
        int width = getWidth(); //Total width
        int height = getHeight(); //Total height
        
        
        //Draws line from upper-left to lower-right
        g.drawLine(0,0, width, height); 
        //Draws line from lower-left to upper-right
        g.drawLine(0, height, width, 0);
    }
    
}

