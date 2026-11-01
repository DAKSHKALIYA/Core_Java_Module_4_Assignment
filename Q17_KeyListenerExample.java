
import javax.swing.*;
import java.awt.event.*;

public class Q17_KeyListenerExample {
    public static void main(String[] args) {

        JFrame f = new JFrame("KeyListener Example");

        JLabel l = new JLabel("Press any key");

        l.setBounds(80, 80, 200, 40);

        f.add(l);

        f.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                char key = e.getKeyChar();
                l.setText("Key Pressed: " + key);
            }
        });

        f.setSize(350, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        f.setFocusable(true);
        f.requestFocusInWindow();
    }
}
