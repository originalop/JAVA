import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;  // Import FlowLayout class

public class SimpleSwingExample {
    public static void main(String[] args) {
        // Create a JFrame (main window)
        JFrame frame = new JFrame("Simple Swing Example");
        
        // Create a JLabel
        JLabel label = new JLabel("Hello, World!");
        
        // Create a JButton
        JButton button = new JButton("Click Me");
        
        // Add ActionListener to JButton
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Change text of label when button is clicked
                label.setText("Button Clicked!");
            }
        });
        
        // Add components to the frame
        frame.setLayout(new FlowLayout()); // Set layout for the frame
        frame.add(label);
        frame.add(button);
        
        // Set default close operation, size, and visibility
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
