package swing;

import javax.swing.JFrame;

public class EmptyFrame {
    public static void main(String[] args) {
        JFrame appFrame = new JFrame();
        appFrame.setSize(400, 250);
        appFrame.setTitle("An Empty Frame");
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.setVisible(true);
    }
}

