package tasks;
import java.util.Scanner;
public class task2 {
    
    public class GradeReportGenerator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter student's name
            System.out.print("Enter student's name: ");
            String studentName = scanner.nextLine();

            // Prompt the user to enter scores in Mathematics, English, and Science
            System.out.print("Enter score in Mathematics: ");
            double mathScore = scanner.nextDouble();

            System.out.print("Enter score in English: ");
            double englishScore = scanner.nextDouble();

            System.out.print("Enter score in Science: ");
            double scienceScore = scanner.nextDouble();

            // Calculate average score
            double averageScore = (mathScore + englishScore + scienceScore) / 3.0;

            // Display the grade report
            System.out.println("Grade Report for " + studentName);
            System.out.println("Mathematics: " + mathScore);
            System.out.println("English: " + englishScore);
            System.out.println("Science: " + scienceScore);
            System.out.printf("Average Score:" + averageScore);

        }
    }
}
