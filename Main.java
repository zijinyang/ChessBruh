import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {
    private static void createAndShowGUI() {
        JFrame jFrame = new JFrame("Chess");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(500, 360);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Chess");
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        label.setBorder(border);
        label.setPreferredSize(new Dimension(150, 100));

        label.setText("Chess");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        jFrame.add(label);
        jFrame.setVisible(true);
    }
    
  public static void main(String[] args) {
    createAndShowGUI();
  }
}
