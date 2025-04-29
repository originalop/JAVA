import javax.swing.*;
public class JListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");

        
        String[] data = {"Item 1", "Item 2", "Item 3", "Item 4"};


        JList<String> list = new JList<>(data);


        list.setBounds(100, 30, 100, 80);


        frame.add(list);


        frame.setLayout(null);
        frame.setVisible(true);
    }
}
