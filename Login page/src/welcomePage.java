import javax.swing.*;
import java.awt.*;

public class welcomePage {
    JFrame jFrame = new JFrame();
    JLabel label = new JLabel("Welcome");

    welcomePage(){

        label.setBounds(0, 0, 200, 35);
        label.setFont(new Font(null, Font.BOLD, 25));

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(420, 420);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.add(label);
    }
}
