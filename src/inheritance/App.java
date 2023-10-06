package inheritance;
// import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter the name of the institute: ");
        // String name = input.nextLine();
        // System.out.print("Enter the year the institute was founded: ");
        // int yearFounded = input.nextInt();
        // System.out.print("Enter the number of faculty members: ");
        // int facultyCount = input.nextInt();
        // System.out.print("Enter the number of staff members: ");
        // int staffCount = input.nextInt();
        // System.out.print("Enter the number of students: ");
        // int studentCount = input.nextInt();
        // System.out.print("Enter the number of departments: ");
        // int numberOfDepartments = input.nextInt();
        // System.out.print("Enter the name of the department: ");
        // String departmentName = input.nextLine();
        // System.out.print("Enter the year the department was founded: ");
        // int departmentYearFounded = input.nextInt();
        // System.out.print("Enter the number of faculty members in the department: ");
        // int departmentFacultyCount = input.nextInt();
        // System.out.print("Enter the number of staff members in the department: ");
        // int departmentStaffCount = input.nextInt();
        // System.out.print("Enter the number of freshman in the department: ");
        // int freshmanCount = input.nextInt();
        // System.out.print("Enter the number of sophomores in the department: ");
        // int sophomoreCount = input.nextInt();
        // System.out.print("Enter the number of juniors in the department: ");
        // int juniorCount = input.nextInt();
        // System.out.print("Enter the number of seniors in the department: ");
        // int seniorCount = input.nextInt();
        // System.out.print("Enter the number of graduate students in the department: ");
        // int graduateCount = input.nextInt();
        // System.out.print("Enter the name of the student: ");
        // String studentName = input.nextLine();
        // System.out.print("Enter the age of the student: ");
        // int studentAge = input.nextInt();
        // System.out.print("Enter the registration number of the student: ");
        // int studentRegistrationNumber = input.nextInt();
        // System.out.print("Enter the height of the student: ");
        // int studentHeight = input.nextInt();
        // System.out.print("Enter the weight of the student: ");
        // int studentWeight = input.nextInt();
        // input.close();
        Student student = new Student("University of Texas at Dallas", 1969, 1000, 2000, 3000, 7, "Computer Science", 1969, 100, 200, 1000, 1000, 1000, 1000, 1000, "John Doe", 20, 123456789, 72, 180);
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.getAge());
        System.out.println("Student registration number: " + student.getRegistrationNumber());
        System.out.println("Department: " + student.getDepartmentName());
        System.out.println("University: " + student.getInstituteName());
    }
}
