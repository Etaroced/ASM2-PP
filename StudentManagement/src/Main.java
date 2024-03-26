import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Enter student list");
            System.out.println("2. Find students by last name");
            System.out.println("3. Find and edit students by full name");
            System.out.println("4. End");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    studentManagement.enterStudentList();
                    break;
                case 2:
                    System.out.print("Enter last name to search: ");
                    String lastName = scanner.nextLine();
                    studentManagement.findStudentsByLastName(lastName);
                    break;
                case 3:
                    System.out.print("Enter full name to search: ");
                    String fullName = scanner.nextLine();
                    studentManagement.findAndEditStudentsByFullName(fullName);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}