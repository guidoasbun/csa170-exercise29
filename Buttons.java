import javax.swing.*;

public class Buttons{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        for(int i = 1; i <= 100; i ++){
            JButton button = new JButton("" + i);
            panel.add(button);
        }
        
        frame.add(panel);
        frame.setSize(800, 500);
        frame.setTitle("One Hundred Buttons");
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}