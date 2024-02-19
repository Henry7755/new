import java.io.*;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        File myfile  = new File("picture.txt");

        try (FileInputStream fis = new FileInputStream(myfile);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br  = new BufferedReader(isr)) {

            String line;
            int numberLine=0;
            int i = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                i = numberLine++;

            }
            System.out.println("Number of line: " + i);
        }catch (IOException e){
            e.printStackTrace();
        }

        int lineNumber = 23;

        try (BufferedReader br = new BufferedReader(new FileReader(myfile))){
            String line;
            int currentLine = 1;
            while (((line = br.readLine() )!= null)){
                if (currentLine == lineNumber){
                    System.out.println("Line "+ lineNumber+": "+line);
                    break;
            }
                currentLine++;
        }

    }catch (IOException e){
        e.printStackTrace();}
    }
}