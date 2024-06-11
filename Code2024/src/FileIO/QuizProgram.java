
package FileIO;
import java.io.*;
import java.util.*;

class Quiz {
    int id;
    int mark;

    Quiz(int id, int mark) {
        this.id = id;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "ID:" + id + " mark:" + mark;
    }
}

/**
 *
 * @author SAKIB AHMED
 */
public class QuizProgram {
    public static void main(String[] args) {
        List<Quiz> quizList = new ArrayList<>();
        String fileName = "/mnt/data/quiz_records.txt"; // replace with your file path

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                int id = Integer.parseInt(parts[0]);
                int mark = Integer.parseInt(parts[1]);
                quizList.add(new Quiz(id, mark));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Quiz highestMarkQuiz = Collections.max(quizList, Comparator.comparingInt(q -> q.mark));

        for (Quiz quiz : quizList) {
            System.out.println(quiz);
        }

        System.out.println("Highest mark obtained by ID:" + highestMarkQuiz.id);
    }
}