import javax.swing.*;
public class JRadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JRadioButton Example");

        frame.setSize(300, 200);


        JRadioButton r1 = new JRadioButton("Male");



        JRadioButton r2 = new JRadioButton("Female");


        r1.setBounds(50, 50, 100, 30);


        r2.setBounds(50, 100, 100, 30);


        ButtonGroup group = new ButtonGroup();

        group.add(r1);
        group.add(r2);


        frame.add(r1);
        frame.add(r2);


        frame.setLayout(null);
        frame.setVisible(true);
    }
}
