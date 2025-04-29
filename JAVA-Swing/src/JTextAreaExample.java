import javax.swing.*;
public class JTextAreaExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea Example");

        frame.setSize(300, 250);

        JTextArea textArea = new JTextArea("Write multiple lines here...");

        textArea.setBounds(50, 50, 200, 100);
        
        frame.add(textArea);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
