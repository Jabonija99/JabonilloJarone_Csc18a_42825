
//This program receives two numbers and computes the sum with GUI

package tut_50;


import javax.swing.JOptionPane;

public class Tut_50 {
    public static void main(String[] args) {
        //Opens input dialog
        //JOptionPane can only take strings
        String fNum = JOptionPane.showInputDialog("Enter first number: ");
        String sNum = JOptionPane.showInputDialog("Enter second number: ");
        
        //Convert string to int for math
        int num1 = Integer.parseInt(fNum);
        int num2 = Integer.parseInt(sNum);
        int sum = num1 + num2;
        
        //Outputs message dialogue GUI
        //Syntax:
        //JOptionPane.showMessageDialog(position, "message", "Window Title", message popup);
        JOptionPane.showMessageDialog(null, "Answer: "+sum, 
                "Addition", JOptionPane.PLAIN_MESSAGE);
        
        
        
        
    }
    
}
