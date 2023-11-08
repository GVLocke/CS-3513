package swing;

import javax.swing.JComponent;
import java.awt.*;


public class HistogramComponent extends JComponent {
    @Override
    public void paintComponent(Graphics g) {
        // Cast to Graphics2D
        Graphics2D graphicsObj = (Graphics2D) g;

        /* Draw the first bin as a green colored rectangle at (10,10)
        * with width 200 and height 50.*/
        Rectangle binRectangle1 = new Rectangle(10, 10, 200, 50);
        Color binColor1 = new Color(163, 190, 140);
        graphicsObj.setColor(binColor1);
        graphicsObj.fill(binRectangle1);

        /*Draw the second bin as a blue colored rectangle at (10,75)
        * with width 150 and height 50. */
        Rectangle binRectangle2 = new Rectangle(10, 70, 150, 50);
        Color binColor2 = new Color(136, 192, 208);
        graphicsObj.setColor(binColor2);
        graphicsObj.fill(binRectangle2);

        /*Draw the third bin as a red colored rectangle at (10,140)
         * with width 350 and height 50. */
        Rectangle binRectangle3 = new Rectangle(10, 140, 350, 50);
        Color binColor3 = new Color(191, 97, 106);
        graphicsObj.setColor(binColor3);
        graphicsObj.fill(binRectangle3);
    }
}