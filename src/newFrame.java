import javax.swing.*;
import java.awt.*;

public class newFrame  extends JFrame {
   public newFrame(){
       setTitle("First Container");
       setSize(400,530);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       setVisible(true);
//       JButton button = new JButton();
//       add(button);

    }

    public void main(String[] args) {
       newFrame space = new newFrame ();


       JButton buttonNorth = new JButton("north");
        JButton buttonSouth = new JButton("south");
        JButton buttonEast = new JButton("east");
        JButton buttonWest = new JButton("west");

        space.setLayout(new BorderLayout());

        space.add(buttonNorth, BorderLayout.NORTH);
        space.add(buttonSouth, BorderLayout.SOUTH);
        space.add(buttonEast,BorderLayout.EAST);
        space.add(buttonWest,BorderLayout.WEST);

        space.setLayout(new FlowLayout());
        for( int i = 1; i<=5; i++){
            JButton button = new JButton("Button"+i);
            space.add(button);
        }
       // space.setVisible(true);

    }
}


