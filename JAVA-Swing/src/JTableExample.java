import javax.swing.*;
public class JTableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Example");
        frame.setSize(400, 200);


        String[][] data = {
            {"1", "John", "25"},
            {"2", "Mary", "22"},
            {"3", "Steve", "30"}
        };


        String[] columns = {"ID", "Name", "Age"};


        JTable table = new JTable(data, columns);

        JScrollPane sp = new JScrollPane(table);


        frame.add(sp);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
