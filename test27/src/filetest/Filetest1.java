
package filetest;

import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class Filetest1 extends JFrame {

    private JTextArea textArea;

    public Filetest1() {
        setTitle("Total Sales");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        displayFileContent();
    }

    private void displayFileContent() {
        FileReader fileReader = new TextFileReader();
        String filePath = "totalsales.txt";
        try {
            String fileContent = fileReader.readFile(filePath);
            textArea.setText(fileContent);
        } catch (FileNotFoundException ex) {
            System.err.println("File not found: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Filetest1 fileReader = new Filetest1();
        fileReader.setVisible(true);
    }
}