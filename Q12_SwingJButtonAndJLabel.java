
import javax.swing.*;
import java.awt.event.*;

public class Q12_SwingJButtonAndJLabel {
    public static void main(String[] args) {

        JFrame f = new JFrame("Button Example");

        JLabel l = new JLabel("Welcome");
        JButton b = new JButton("Click Me");

        l.setBounds(100, 50, 200, 30);
        b.setBounds(100, 100, 120, 40);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Button Pressed");
            }
        });

        f.add(l);
        f.add(b);

        f.setSize(350, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
