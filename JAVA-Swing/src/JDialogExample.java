import javax.swing.*;
public class JDialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Parent Frame");
        JDialog dialog = new JDialog(frame, "Dialog Example", true);
        dialog.setSize(200, 150);
        dialog.setVisible(true);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
