
package javaapplication7;

import java.io.*;
import java.util.*;

public class DailySales {
    private static final String SALES_FILE = "sales.txt";

    public static void recordSale(double amount) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(SALES_FILE, true))) {
            writer.write(String.valueOf(amount));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double getTotalSales() {
        double totalSales = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(SALES_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                totalSales += Double.parseDouble(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalSales;
    }
}

