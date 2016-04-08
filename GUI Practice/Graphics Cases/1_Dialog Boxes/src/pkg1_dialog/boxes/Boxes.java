/*  CHAPTER 2  GUI AND GRAPHICS CASE STUDY  */
/*          Using Dialogue Boxes            */


/**  Notes  **
* Utilizes Java swing tool
    - javax.swing contains many classes for GUI

*/



package pkg1_dialog.boxes;



import javax.swing.JOptionPane;
// JOptionPane provides prebuilt dialog boxes that enable 
// programs to display windows containing messages.


public class Boxes {
    public static void main(String[] args) {
        //Display a dialog with a message (Position, Object to display)
        JOptionPane.showMessageDialog(null, "Welcome to Java");
        
        
    }
    
}
