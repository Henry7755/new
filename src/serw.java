import javax.swing.*;
public class serw {
    public static void main(String[] args) {
    JFrame frame = new JFrame("GroupLayout Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create components
    JLabel nameLabel = new JLabel("Name:");
    JTextField nameField = new JTextField(20);
    JLabel ageLabel = new JLabel("Age:");
    JTextField ageField = new JTextField(5);

    // Create GroupLayout and associate it with the content pane of the frame
    GroupLayout layout = new GroupLayout(frame.getContentPane());
    frame.getContentPane().setLayout(layout);

    // Turn on automatic gaps and padding
    layout.setAutoCreateGaps(true);
    layout.setAutoCreateContainerGaps(true);

    // Create horizontal groups
    GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
    hGroup.addGroup(layout.createParallelGroup()
            .addComponent(nameLabel)
            .addComponent(ageLabel));
    hGroup.addGroup(layout.createParallelGroup()
            .addComponent(nameField)
            .addComponent(ageField));
    layout.setHorizontalGroup(hGroup);

    // Create vertical groups
    GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
    vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(nameLabel)
            .addComponent(nameField));
    vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(ageLabel)
            .addComponent(ageField));
    layout.setVerticalGroup(vGroup);

    // Pack and display the frame
    frame.pack();
    frame.setVisible(true);
}
}
