
package tut_51_jframegui;

import java.awt.FlowLayout; //Layout Manager class
import javax.swing.JFrame; //Basic window features
import javax.swing.JLabel; //Lines of text/ simple images

//Inherit JFrame
public class GUIPractice extends JFrame {
    private JLabel item1;
    
    public GUIPractice (){
        //First line is title of window
        super("GUI Title"); //Title of window
        setLayout(new FlowLayout()); //Gives the default layout
        
        item1 = new JLabel("This is a sentence."); //Screen text
        item1.setToolTipText("Hover Popup"); //Tool tip text popup on hoveron
    
        add(item1); //Adds item on the screen.
    }

    
}
