//Obtains user input from dialog box
package pkg1.pkg2_textbox;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //Prompt user
        String name = JOptionPane.showInputDialog("What is your name? ");
        
        //Create message
        String msg = String.format("Welcome, %s, to Java Programming!", name);
        
        //Display message
        JOptionPane.showMessageDialog(null, msg);
        
    }
    
}
