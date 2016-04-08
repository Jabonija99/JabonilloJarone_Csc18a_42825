//Creates JFrame to display DrawPanel
package pkg2_simpledrawings;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        //Creates a panel that contains the drawing
        DrawPanel panel = new DrawPanel();
        
        //Creates a new frame to hold panel
        JFrame application = new JFrame();
        
        //Sets the frame to exit when it is closed
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(panel); //add the panel to the frame
        application.setSize(250,250); //sets the size of the frame
        application.setVisible(true); //Makes the frame visible
       
    }
}

