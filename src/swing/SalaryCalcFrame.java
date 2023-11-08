package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalaryCalcFrame extends JFrame implements ActionListener {
    private final JTextField salaryField = new JTextField(15);
    private final JTextField wageField = new JTextField(15);

    SalaryCalcFrame() {
        GridBagConstraints layoutConstraints;
        setTitle("Salary");
        wageField.setEditable(true);
        wageField.setText("0");
        wageField.addActionListener(this);


        salaryField.setEditable(false);
        setLayout(new GridBagLayout());
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 0;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        JLabel wageLabel = new JLabel("Hourly Wage:");
        add(wageLabel, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 1;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        JLabel salaryLabel = new JLabel("Yearly Wage:");
        add(salaryLabel, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 0;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        add(wageField, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 1;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        add(salaryField, layoutConstraints);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int hourlyWage = Integer.parseInt(wageField.getText());
        salaryField.setText(Integer.toString(hourlyWage * 40 * 50));
    }

}
