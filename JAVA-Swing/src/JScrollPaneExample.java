import javax.swing.*;
public class JScrollPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollPane Example");
        JTextArea textArea = new JTextArea(10, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
