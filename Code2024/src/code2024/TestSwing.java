
package code2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class TestSwing extends JFrame {
    private final JLabel temperatureLabel;

    public TestSwing() {
        setTitle("Weather App");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        temperatureLabel = new JLabel("Temperature: ");
        panel.add(temperatureLabel, BorderLayout.CENTER);

        JButton updateButton = new JButton("Update");
        updateButton.addActionListener((ActionEvent e) -> {
            updateTemperature();
        });
        panel.add(updateButton, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    private void updateTemperature() {
        // Simulate fetching temperature from an API
        int minTemp = -20;
        int maxTemp = 40;
        int randomTemp = new Random().nextInt(maxTemp - minTemp + 1) + minTemp;
        temperatureLabel.setText("Temperature: " + randomTemp + "°C");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TestSwing();
            }
        });
    }
}