import javax.swing.*;
public class JCheckBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JCheckBox Example");

        frame.setSize(300, 200);


        JCheckBox checkBox = new JCheckBox("I agree");


        checkBox.setBounds(100, 80, 100, 30);


        frame.add(checkBox);




        frame.setLayout(null);


        frame.setVisible(true);


        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
