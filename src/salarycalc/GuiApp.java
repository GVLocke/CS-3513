package salarycalc;
import javax.swing.*;
import java.awt.*;

public class GuiApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salary Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));
        JLabel wageLabel = new JLabel("Hourly wage:");
        JTextField wageField = new JTextField();
        JLabel hoursLabel = new JLabel("Hours worked per week:");
        JTextField hoursField = new JTextField();
        JLabel weeksLabel = new JLabel("Weeks worked per year:");
        JTextField weeksField = new JTextField();
        JButton calculateButton = new JButton("Calculate");
        JLabel resultLabel = new JLabel("Salary is $0.00");
        InputVerifier verifier = new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                JTextField textField = (JTextField) input;
                try {
                    int value = Integer.parseInt(textField.getText());
                    return value > 0;
                } catch (NumberFormatException ex) {
                    return false;
                }
            }
        };
        wageField.setInputVerifier(verifier);
        hoursField.setInputVerifier(verifier);
        weeksField.setInputVerifier(verifier);
        calculateButton.addActionListener(e -> {
            try {
                int wage = Integer.parseInt(wageField.getText());
                int hoursPerWeek = Integer.parseInt(hoursField.getText());
                int weeksPerYear = Integer.parseInt(weeksField.getText());
                double salary = wage * hoursPerWeek * weeksPerYear;
                resultLabel.setText(String.format("Salary is $%.2f", salary));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input");
            }
        });
        panel.add(wageLabel);
        panel.add(wageField);
        panel.add(hoursLabel);
        panel.add(hoursField);
        panel.add(weeksLabel);
        panel.add(weeksField);
        panel.add(calculateButton);
        panel.add(resultLabel);
        frame.add(panel);
        frame.setVisible(true);
    }
}