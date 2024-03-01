package tasks;
import java.util.Scanner;
public class Ex1 {
    public class PasswordGenerator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask the user for their first name, last name, and gender
            System.out.print("Enter your first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter your last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter your gender (M/F): ");
            String gender = scanner.nextLine();

            // For password using string methods
            String password = generatePassword(firstName, lastName, gender);

            System.out.println("Your generated password is: " + password);

        }

        //  generate password using string method
        public static String generatePassword(String firstName, String lastName, String gender) {
            // Extract the first character of the first name and last name
            char firstChar = firstName.charAt(0);
            char lastChar = lastName.charAt(0);

            // gender to uppercase
            String genderInitial = gender.toUpperCase();

            // Concatenate first name, last name, and gender initial
            String password = Character.toString(firstChar) + Character.toString(lastChar) + genderInitial;

            return password;
        }
    }


}
