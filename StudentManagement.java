import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    double grade = scanner.nextDouble();
                    studentList.add(new Student(id, name, grade));
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    for (Student s : studentList) {
                        s.displayInfo();
                    }
                    break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = scanner.nextInt();
                    boolean found = false;
                    for (Student s : studentList) {
                        if (s.getId() == searchId) {
                            s.displayInfo();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
