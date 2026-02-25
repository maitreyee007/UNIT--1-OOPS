import java.util.Scanner;
class StudentDetails {
 String name;
 int age;

 String department;
 void displayDetails(int num) {
 System.out.println("Student " + num);
 System.out.println("Name : " + name);
 System.out.println("Age : " + age);
 System.out.println("Dept : " + department);
 }
}
public class Main {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 System.out.println("Enter number of students:");
 int n = sc.nextInt();
 sc.nextLine();

 StudentDetails[] students = new StudentDetails[n];

 for (int i = 0; i < n; i++) {
 students[i] = new StudentDetails();
 System.out.println("\nEnter details for student " + (i + 1));
System.out.println("Enter student name:");

 students[i].name = sc.nextLine();
 System.out.println("Enter student age:");

 students[i].age = sc.nextInt();
 sc.nextLine();
 System.out.println("Enter student department:");

 students[i].department = sc.nextLine();
 }

 System.out.println("\n----- STUDENT DETAILS -----");
 for (int i = 0; i < n; i++) {
 students[i].displayDetails(i + 1);

 }

 sc.close();
 }
}
