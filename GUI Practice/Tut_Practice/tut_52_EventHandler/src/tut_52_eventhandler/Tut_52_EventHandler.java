
package tut_52_eventhandler;
//Demonstrates event handling
//Program opens a window and receives a string


import javax.swing.JFrame;

public class Tut_52_EventHandler  {
    public static void main(String[] args) {
        EventH event = new EventH();
        event.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        event.setSize(350,100);
        event.setVisible(true);
    }
    
}