
import java.awt.*;

public class Q8_SimpleAWTFrame {
    public static void main(String[] args) {

        Frame f = new Frame("My First Frame");

        Label l = new Label("Welcome to Java GUI");

        l.setBounds(80, 100, 200, 30);

        f.add(l);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
