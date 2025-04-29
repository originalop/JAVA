import javax.swing.*;
public class JButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JButton Example");



        JButton button = new JButton("Click Me");

        button.setBounds(100, 80, 1000, 30);

        frame.add(button);


        frame.setSize(100, 100);

        frame.setLayout(null);
        frame.setVisible(true);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
