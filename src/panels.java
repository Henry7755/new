import javax.swing.*;
import java.awt.*;

public class panels extends JFrame {
    public panels(){

        setSize(250,250);
        setLayout(null);
        JPanel red = new JPanel();
        red.setBackground(Color.RED);
        red.setBounds(24,15,5,2);
        add(red);

        setVisible(true);
    }

    public static void main(String[] args) {
        panels p = new panels();
    }

}
