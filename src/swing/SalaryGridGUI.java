package swing;

import javax.swing.*;
import java.awt.*;

public class SalaryGridGUI {
    public static void main(String[] args) {
        int hourlyWage = 20;
        JFrame topFrame = new JFrame("Salary");
        JLabel wageLabel = new JLabel("Hourly Wage ");
        JLabel salaryLabel = new JLabel("Yearly Salary: ");
        JTextField salaryField = new JTextField(15);
        JTextField wageField = new JTextField(15);
        GridBagConstraints layoutConstraints = new GridBagConstraints();

        wageField.setEditable(false);
        wageField.setText(Integer.toString(hourlyWage));

        salaryField.setEditable(false);
        salaryField.setText(Integer.toString(hourlyWage * 40 * 52));

        // use a GridBagLayout
        topFrame.setLayout(new GridBagLayout());

        // specify component's grid location
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 0;

        // 10 pixels of padding around component
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        topFrame.add(wageLabel, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 0;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        topFrame.add(wageField, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 1;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        topFrame.add(salaryLabel, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 1;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        topFrame.add(salaryField, layoutConstraints);

        topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        topFrame.pack();
        topFrame.setVisible(true);
    }
}
