
import javax.swing.*;
import java.awt.event.*;

public class Q15_ActionListener {
    public static void main(String[] args) {

        JFrame f = new JFrame("ActionListener Example");

        JButton b = new JButton("Click Me");

        b.setBounds(100, 80, 120, 40);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Hello User");
            }
        });

        f.add(b);

        f.setSize(350, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
