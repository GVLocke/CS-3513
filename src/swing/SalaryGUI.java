package swing;

import javax.swing.*;

public class SalaryGUI {
    public static void main(String[] args) {
        SalaryCalcFrame myFrame = new SalaryCalcFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}
