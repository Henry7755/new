import javax.swing.*;
import java.awt.*;
public class color {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Colored Text Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);

        // Create a JPanel with FlowLayout
        JPanel panel = new JPanel(new FlowLayout());

        // Create JLabels with different colored text
        JLabel redLabel = createColoredLabel("Red Text", Color.RED);
        JLabel greenLabel = createColoredLabel("Green Text", Color.GREEN);
        JLabel blueLabel = createColoredLabel("Blue Text", Color.BLUE);

        // Add the JLabels to the panel
        panel.add(redLabel);
        panel.add(greenLabel);
        panel.add(blueLabel);

        // Add the panel to the frame
        frame.add(panel);

        frame.setVisible(true);
    }

    // Helper method to create a JLabel with colored text
    private static JLabel createColoredLabel(String text, Color color) {
        JLabel label = new JLabel(text);
        label.setForeground(color); // Set text color
        return label;
    }
}
