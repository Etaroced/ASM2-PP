import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private ArrayList<Student> studentList;
    private Scanner scanner;

    public StudentManagement() {
        studentList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void enterStudentList() {
        System.out.println("Enter student list:");
        while (true) {
            System.out.print("Enter student's first name: ");
            String firstName = scanner.nextLine();
            if (firstName.equalsIgnoreCase("end")) break;

            System.out.print("Enter student's last name: ");
            String lastName = scanner.nextLine();
            studentList.add(new Student(firstName, lastName));
        }
    }

    public void findStudentsByLastName(String lastName) {
        System.out.println("Students with last name '" + lastName + "':");
        boolean found = false;
        for (Student student : studentList) {
            if (student.getLastName().equalsIgnoreCase(lastName)) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found with last name '" + lastName + "'.");
        }
    }

    public void findAndEditStudentsByFullName(String fullName) {
        System.out.println("Searching for student with full name '" + fullName + "':");
        for (Student student : studentList) {
            if ((student.getFirstName() + " " + student.getLastName()).equalsIgnoreCase(fullName)) {
                System.out.println("Student found: " + student.getFirstName() + " " + student.getLastName());
                System.out.print("Enter new first name: ");
                String newFirstName = scanner.nextLine();
                System.out.print("Enter new last name: ");
                String newLastName = scanner.nextLine();
                student.setFirstName(newFirstName);
                student.setLastName(newLastName);
                System.out.println("Student information updated successfully.");
                return;
            }
        }
        System.out.println("No student found with full name '" + fullName + "'.");
    }
}
