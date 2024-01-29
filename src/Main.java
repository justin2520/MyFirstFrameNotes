import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //1 Create a frame.
        JFrame frame = new JFrame();
        frame.setSize(500,500);

        //2 Create a panel.
        JPanel panel = new JPanel();
        panel.setBackground(new Color(100,50,180));
        panel.setBackground(Color.CYAN);

        //3 Create components.
        JLabel label = new JLabel("Hello, Seaver!");
        JButton button = new JButton("Don't Touch");
        JTextField textField = new JTextField(5);
        JScrollBar scrollBar = new JScrollBar();

        // Add an image
        ImageIcon icon = new ImageIcon("Images/PNG/2C.png");
        icon.setImage(icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel iconLabel = new JLabel(icon);

        //4 Add components to the panel.
        panel.add(label);
        panel.add(button);
        panel.add(textField);
        panel.add(iconLabel);
        panel.add(scrollBar);

        //5 Add the panel to the frame.
        frame.add(panel);

        //6 Make the frame visible.
        frame.setVisible(true);
    }
}