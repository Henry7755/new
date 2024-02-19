import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Image {





        public static void main(String[] args) {
            try {
                // Load an image
                BufferedImage image = ImageIO.read(new File("Sandra.jpg"));

                // Get dimensions of the image
                int width = image.getWidth();
                int height = image.getHeight();

                // Access and manipulate pixel data
                for (int y = 0; y < height; y++) {
                    for (int x = 0; x < width; x++) {
                        int rgb = image.getRGB(x, y);
                        // Extract color components
                        int alpha = (rgb >> 24) & 0xFF;
                        int red = (rgb >> 16) & 0xFF;
                        int green = (rgb >> 8) & 0xFF;
                        int blue = rgb & 0xFF;

                        // Example: Invert colors
                        int invertedRGB = ((0xFF - alpha) << 24) |
                                ((0xFF - red) << 16) |
                                ((0xFF - green) << 8) |
                                (0xFF - blue);

                        // Set modified pixel back to the image
                        image.setRGB(x, y, invertedRGB);
                    }
                }

                // Save the modified image
                ImageIO.write(image, "jpg", new File("Sandra.jpg"));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


