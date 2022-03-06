import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    Panel p = new Panel();
    public Frame(){
        setSize(700, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); //метод компановки

        add(p, BorderLayout.CENTER);

        setVisible(true);
    }
}
