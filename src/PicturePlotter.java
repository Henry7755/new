import javax.swing.*;
import java.awt.*;

public class PicturePlotter extends JPanel {
    private int width;
    private int height;

    public PicturePlotter(int width, int height) {
        this.width = width;
        this.height = height;
        JFrame frame = new JFrame();
        frame.getContentPane().add(this);
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void plot(int x, int y, int count, int color) {
        Graphics g = getGraphics();
        g.setColor(getColor(color));
        for (int i = 0; i < count; i++) {
            g.drawLine(x + i, y, x + i, y);
        }
    }

    private Color getColor(int color) {
        switch (color) {
            case 0:
                return Color.BLUE;
            case 1:
                return Color.WHITE;
            case 2:
                return Color.GREEN;
            case 3:
                return Color.ORANGE;
            case 4:
                return Color.PINK;
            case 5:
                return Color.YELLOW;
            case 6:
                return Color.MAGENTA;
            case 7:
                return Color.RED;
            case 8:
                return Color.lightGray;
            // Add more color mappings as needed
            default:
                return Color.BLACK;
        }
    }
}
