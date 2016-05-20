
package tut_52_eventhandler;

import java.awt.FlowLayout;
import java.awt.event.ActionListener; //Waits for event actions
import java.awt.event.ActionEvent; //Events
import javax.swing.JFrame; //Basic Window features
import javax.swing.JTextField; //Text field to receive text
import javax.swing.JPasswordField; //Hidden/Asterisk text field
import javax.swing.JOptionPane; //Blank window


public class EventH extends JFrame{
    private JTextField userIn1; //User input box 1
    private JTextField userIn2; //User input box 2
    private JTextField userIn3; //User input box 3
    private JPasswordField sUsrIn; //Secured user input box
    
    //Constructor constructs the window
    public EventH(){
        super("Event Handling"); //Title 
        setLayout(new FlowLayout()); //Window Layout
        
        userIn1 = new JTextField(10);//Parameter(Size of text field)
        add(userIn1); //Adds item to screen
        
        userIn2 = new JTextField("Enter text here"); //Parameter(Text Filler)
        add(userIn2); //Adds item to screen
        
        userIn3 = new JTextField("Uneditable",20); //Enters text with 20 spaces
        userIn3.setEditable(false); //Disables edit
        add(userIn3); //Adds item to screen
        
        sUsrIn = new JPasswordField("MyPass");//Adds text with asterisks
        add(sUsrIn); //Adds item to screen
        
        //Action listener object - waits or "listens" for an action
        ActHandle handle = new ActHandle();
        
        //Receives object as the paramemters
        userIn1.addActionListener(handle); //user input 1 listens for action
        userIn2.addActionListener(handle); //user input 2 listens for action
        userIn3.addActionListener(handle); //user input 3 listens for actionb
        sUsrIn.addActionListener(handle); //secured user input listens for action
    }
    
    //Class that handles events
    //Must implement actionlistener to read events
    private class ActHandle implements ActionListener{ 
        
        //Must name the method actionPerormed
        @Override
        public void actionPerformed(ActionEvent event){
            String word = "";
            
            //If the user clicks the first text box
            if(event.getSource() == userIn1){
                //Receives text from event location and formats
                word = word.format("Field 1: %s", event.getActionCommand());
            }
            else if(event.getSource() == userIn2){
                //Receives text from event location then formats
                word = word.format("Field 2: %s", event.getActionCommand());
            }
            else if(event.getSource() == userIn3){
                //Assigns received word to var from event location
                word = word.format("Field 3: %s", event.getActionCommand());
            }
            else if(event.getSource() ==  sUsrIn){
                //Receives secured string
                word = word.format("Secured Field: %s", event.getActionCommand());
            }
            
            //Creates blank window parameters(position, message)
            JOptionPane.showMessageDialog(null, word);
        
        }
    }
    
    
}
