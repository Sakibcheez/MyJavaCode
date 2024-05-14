
package code2024;



import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeWatch extends JFrame
{
    private final JLabel timeLabel;

    public TimeWatch() {
        setTitle("Time Watch");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set up the GUI components
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        mainPanel.add(timeLabel, BorderLayout.CENTER);

        getContentPane().add(mainPanel);
        getContentPane().setBackground(Color.WHITE);

        // Update the time label every second
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
    }

    private void updateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        timeLabel.setText(dateFormat.format(new Date()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TimeWatch timeWatch = new TimeWatch();
            timeWatch.setVisible(true);
        });
    }
}
