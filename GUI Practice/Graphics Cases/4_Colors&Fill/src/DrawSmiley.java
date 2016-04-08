//Draws a smiley face using colors and filled shapes

import java.awt.Color; //Represents colors using their RGB values
import java.awt.Graphics; //Draws texts and shapes
import javax.swing.JPanel; //Panel for displaying images
import javax.swing.JFrame;

public class DrawSmiley extends JPanel{
    
    public void paintComponent(Graphics g){
        //Graphics correction
        super.paintComponent(g);
        
        //Draw the face
        g.setColor(Color.YELLOW); //Set color to yellow
        g.fillOval(10, 10, 200, 200); //Draws and fills the oval with color
        
        //Draw eyes
        g.setColor(Color.BLACK); //Sets color to black
        g.fillOval(55, 65, 30, 30); //Draws and fills oval
        g.fillOval(135, 65, 30, 30); //Draws and fills oval
        
        //Draw mouth
        g.fillOval(50, 110, 120, 60); //Draws and fills oval
        
        //Fixes the mouth
        g.setColor(Color.YELLOW); //Sets color to yellow
        g.fillRect(50, 110, 120, 30); //Draws and fills oval
        g.fillOval(50, 120, 120, 40); //Draws and fills oval
    }
    
    public static void main(String[] args) {
        DrawSmiley panel = new DrawSmiley();
        JFrame app = new JFrame();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(230,250);
        app.setVisible(true);
        
    }
    
}
