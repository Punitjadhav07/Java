import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {
    private JLabel label;
    private JButton button;

    public App() {
        super("My First GUI"); // Set the title of the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the JFrame is closed
    
        // Create a label
        label = new JLabel("Hello, GUI!");
        label.setFont(new Font("Arial", Font.PLAIN, 24));
        label.setHorizontalAlignment(SwingConstants.CENTER); // Center the text
    
        // Create a button
        button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });
    
        // Set the layout manager for the JFrame
        setLayout(new BorderLayout());
    
        // Add the components to the JFrame
        add(label, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
    
        // Set the size of the JFrame and make it visible
        setSize(400, 200);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // Create an instance of MyGUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new App();
            }
        });
    }
}
