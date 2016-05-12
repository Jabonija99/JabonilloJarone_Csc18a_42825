
package tut_51_jframegui;

import javax.swing.JFrame; //Basic window features

public class Tut_51_JFrameGUI {
    public static void main(String[] args) {
        GUIPractice gui1 = new GUIPractice(); //Gui object
        //Commands Gui to close when the x is pressed.
        gui1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui1.setSize(275,180); //Window size
        gui1.setVisible(true); //Enable window visibility
        
        
    }
    
}
