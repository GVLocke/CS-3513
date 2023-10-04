package messingwithfiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayPicture {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Display Picture");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    BufferedImage image = ImageIO.read(new File("src/messingwithfiles/Logo2-mini.PNG"));
                    g.drawImage(image, 0, 0, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        frame.add(panel); // Add the panel to the frame
        
        frame.setVisible(true);
    }
}