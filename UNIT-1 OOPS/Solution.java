import java.util.Scanner;
class Prince {
 String role;
 int age;
 Prince(String role, int age) {
 this.role = role;
 this.age = age;
 }
 void details() {
 System.out.println("Your Role: " + role);
 System.out.println("Age: " + age);
}
}
public class Solution{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter Your Role");
 String role = sc.nextLine();
 System.out.println("Enter Your Age");
 int age = sc.nextInt();
 Prince p = new Prince(role, age);
 p.details();
 sc.close();
 }
}