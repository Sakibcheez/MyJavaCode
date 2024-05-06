
package code2024;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author SAKIB AHMED
 */
public class CurrentTimePrint {
    public static void main(String[] args) {
        
       // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Format the current time to display in AM/PM format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedTime = currentTime.format(formatter);

        // Display the current time
        System.out.println("Current time: " + formattedTime);
    }
}

