package truthtables;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TruthTableApp extends JFrame {
    private JTextField inputField;
    private JTextArea outputArea;

    public TruthTableApp() {
        // Create GUI components
        inputField = new JTextField();
        JButton generateButton = new JButton("Generate");
        outputArea = new JTextArea();

        // Configure layout
        setLayout(new BorderLayout());
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel("Enter logical proposition:"), BorderLayout.NORTH);
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(generateButton, BorderLayout.SOUTH);
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Add action listener to generate button
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String proposition = inputField.getText();
                // TODO: Generate truth table based on proposition
                // TODO: Update outputArea with the generated truth table
            }
        });

        // Configure window
        setTitle("Truth Table App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TruthTableApp().setVisible(true);
            }
        });
    }
}
