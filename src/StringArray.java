import java.io.*;
import java.nio.Buffer;

public class StringArray {
    public static void main(String[] args) {
        File myNewFile = new File("picture.txt");

        int line = 27;

        try(BufferedReader br = new BufferedReader( new FileReader(myNewFile) ) ) {
            String newL;
            int currentline = 1;

            while ((newL = br.readLine()) != null){
                if (currentline == line){
                    System.out.println(newL);

                }
                currentline++;
            }

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);

    }
}
}
