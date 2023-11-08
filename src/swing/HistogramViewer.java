package swing;

import javax.swing.JFrame;
import java.awt.Color;

public class HistogramViewer {
    public static void main(String[] args) {
        JFrame appFrame = new JFrame("Histogram Viewer");
        HistogramComponent histogramComponent = new HistogramComponent();
        Color nord1 = new Color(59, 66, 82);
        appFrame.getContentPane().setBackground(nord1);

        appFrame.setSize(400, 250);
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the histogram component to the frame
        appFrame.add(histogramComponent);
        appFrame.setVisible(true);
    }
}
