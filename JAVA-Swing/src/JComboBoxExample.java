import javax.swing.*;
public class JComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example");
        frame.setSize(300, 200);


        String[] items = {"Item 1", "Item 2", "Item 3"};


        JComboBox<String> comboBox = new JComboBox<>(items);

        
        comboBox.setBounds(100, 80, 100, 30);
        frame.add(comboBox);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
