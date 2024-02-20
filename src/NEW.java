import java.io.*;

public class NEW {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("picture.txt"));
            String line = reader.readLine();
            String[] dimensions = line.split(" ");
            int width = Integer.parseInt(dimensions[0]);
            int height = Integer.parseInt(dimensions[1]);
            PicturePlotter plotter = new PicturePlotter(width,height);

            line = reader.readLine();
            int y = 0;
            while (line != null && !line.equals("-1")) {
                String[] pairs = line.split(" ");
                int x = 0;
                for (int i = 0; i < pairs.length; i += 2) {
                    int count = Integer.parseInt(pairs[i]);
                    int color = Integer.parseInt(pairs[i + 1]);
                    plotter.plot(x, y, count, color);
                    x += count;
                }
                y++;
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}}
