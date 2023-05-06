import java.util.Scanner;

public class EnrollmentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Course course = new Course("", 30); // max students
        
        System.out.println("UNIVERSITY OF THE PHILIPPINES ENROLLMENT FORM");
        System.out.println();
        
        while (true) {
            System.out.println("1. Enroll a student");
            System.out.println("2. Check enrolled students");
            System.out.println("3. Delete a student");
            System.out.println("4. Update student info");
            System.out.println("5. Quit");
            
            System.out.println();
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println();
            
            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter student ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Enter student strand: ");
                String strand = scanner.nextLine();
                
                System.out.print("Enter student address: ");
                String address = scanner.nextLine();
                
                System.out.print("Enter student email: ");
                String email = scanner.nextLine();
                
                Student student = new Student(name, id, strand, address, email);
                
                System.out.println();
                
                if (course.enroll(student)) {
                    System.out.println("Enrollment successful.");
                    System.out.println();
                } else {
                    System.out.println("Enrollment failed. Course is full.");
                    System.out.println();
                }
            } else if (choice == 2) {
                System.out.println("Enrolled students:");
                System.out.println();
                for (Student student : course.getEnrolledStudents()) {
                    if (student != null) {
                        System.out.println("Name: " + student.getName());
                        System.out.println("Id:" + student.getId());
                        System.out.println("Strand:" + student.getStrand());
                        System.out.println("Address:" + student.getAddress());
                        System.out.println("Email:" + student.getEmail());
                        System.out.println();
                    }
                }
            } else if (choice == 3) {
                System.out.print("Enter student ID to delete: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                
                if (course.deleteStudent(id)) {
                    System.out.println("Student with ID " + id + " has been deleted from the course.");
                    System.out.println();
                } else {
                    System.out.println("Student with ID " + id + " not found.");
                    System.out.println();
                }
            } else if (choice == 4) {
                System.out.print("Enter student ID to update: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                
                Student studentToUpdate = course.findStudentById(id);
                
                if (studentToUpdate == null) {
                    System.out.println("Student with ID " + id + " not found.");
                    System.out.println();
                } else {
                	System.out.println();
                    System.out.println("Which field do you want to update?");
                    System.out.println();
                    System.out.println("1. Name");
                    System.out.println("2. ID");
                    System.out.println("3. Strand");
                    System.out.println("4. Address");
                    System.out.println("5. Email");
                    System.out.println();
                    System.out.print("Enter your choice: ");
                    int fieldChoice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    
                    switch (fieldChoice) {
                        case 1:
                            System.out.print("Enter new name: ");
                            String newName = scanner.nextLine();
                            studentToUpdate.setName(newName);
                            System.out.println();
                            break;
                        case 2:
                            System.out.print("Enter new ID: ");
                            int newId = scanner.nextInt();
                            scanner.nextLine();
                            studentToUpdate.setId(newId);
                            System.out.println();
                            break;
                        case 3:
                            System.out.print("Enter new strand: ");
                            String newStrand = scanner.nextLine();
                            studentToUpdate.setStrand(newStrand);
                            System.out.println();
                            break;
                        case 4:
                            System.out.print("Enter new address: ");
                            String newAddress = scanner.nextLine();
                            studentToUpdate.setAddress(newAddress);
                            System.out.println();
                            break;
                        case 5:
                            System.out.print("Enter new email: ");
                            String newEmail = scanner.nextLine();
                            studentToUpdate.setEmail(newEmail);
                            System.out.println();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                }
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
                System.out.println();
            }
        }
        
        
    }
}
