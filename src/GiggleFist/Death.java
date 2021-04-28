package GiggleFist;
import javax.swing.*;

public class Death {
    public static void Death() {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("../../pictures/youdied.jpg");
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
