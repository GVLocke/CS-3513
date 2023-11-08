package swing;

import javax.swing.*;

public class SalaryGUI {
    public static void main(String[] args) {
        int hourlyWage = 20;
        JFrame topFrame = null;
        JTextField outputField = null;

        outputField = new JTextField();
        outputField.setText("An hourly wage of " + hourlyWage + "/hr yields $" + (hourlyWage * 40 * 50) + "/yr");
        outputField.setEditable(false);

        topFrame = new JFrame("Salary");
        topFrame.add(outputField);

        // Resize window to fit components
        topFrame.pack();

        topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        topFrame.setVisible(true);
    }
}
