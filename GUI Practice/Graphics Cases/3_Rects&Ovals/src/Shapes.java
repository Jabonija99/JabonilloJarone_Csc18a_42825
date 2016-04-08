//Draws a cascade of shapes

import java.awt.Graphics; //imports graphics for text and shapes
import javax.swing.JPanel; //Panel to draw
import javax.swing.JFrame; //Panel frame

public class Shapes extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        //Loops for scaling
        for(int i = 0; i < 10; i++){
            //Draws a rectangle
            g.drawRect(10 + i * 10, 10 + i * 10,
                    50 + i * 10, 50 + i * 10);
            //Draws an Oval
            g.drawOval(240 + i * 10, 10 + i * 10,
                    50 + i * 10, 50 + i * 10);
        }
    
    }
    
    
    public static void main(String[] args) {
        Shapes panel = new Shapes(); //Creates the panel
        JFrame application = new JFrame(); //Creates a new JFrame
        
        //Exits when the user closes
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Adds a panel
        application.add(panel);
        //Sets the size of the panel
        application.setSize(500, 290);
        //Enables visibility for panel
        application.setVisible(true);
        
    }
    
}
