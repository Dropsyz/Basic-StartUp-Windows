import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.awt.Font.ITALIC;

public class loginPage implements ActionListener {

    JFrame jframe = new JFrame();
    JButton jButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel userIDName = new JLabel("Username");
    JLabel passwordID = new JLabel("Password");
    JLabel messageLabel = new JLabel();
    Map<String, String> loginInfo = new LinkedHashMap<>();
    loginPage(Map<String, String> loginInfoOriginal){

        loginInfo = loginInfoOriginal;

        userIDField.setBounds(125, 100, 200, 25);
        passwordField.setBounds(125, 150, 200, 25);

        userIDName.setBounds(50, 100, 75, 25);
        passwordID  .setBounds(50, 150, 75, 25);

        messageLabel.setBounds(125, 300, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        jButton.setBounds(125, 200, 100, 25);
        jButton.addActionListener(this);
        jButton.setFocusable(false);

        resetButton.setBounds(125, 250, 100, 25);
        resetButton.addActionListener(this);
        resetButton.setFocusable(false);


        jframe.add(jButton);
        jframe.add(resetButton);
        jframe.add(userIDName);
        jframe.add(passwordID);
        jframe.add(messageLabel);
        jframe.add(userIDField);
        jframe.add(passwordField);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(420, 420);
        jframe.setLayout(null);
        jframe.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resetButton){
            userIDField.setText("");
            passwordField.setText("");
        }

        if (e.getSource() == jButton){
            String userID = userIDField.getText();
            String passwordID = String.valueOf(passwordField.getPassword());

            if (loginInfo.containsKey(userID)){
                if (loginInfo.get(userID).equals(passwordID)){
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Hello World");
                    jframe.dispose();
                    welcomePage welcomePage = new welcomePage();
                }else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Try again");
                }
            }else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Username NOT FOUND");
            }
        }
    }
}
