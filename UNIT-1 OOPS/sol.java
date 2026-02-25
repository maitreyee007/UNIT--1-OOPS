import java.util.Scanner;
class CustomerDetails {
 String name;
 String contact;
 void displayDetails(int num) {
 System.out.println("\nCustomer " + num);
 System.out.println("Name : " + name);
 System.out.println("Contact : " + contact);
 }
}
class sol {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter number of Books:");
 int n = sc.nextInt();
 sc.nextLine();
 CustomerDetails[] customers = new CustomerDetails[n];
 for (int i = 0; i < n; i++) {
 customers[i] = new CustomerDetails();
 System.out.println("\nEnter details for rent " + (i + 1));
 System.out.println("Enter customer's name:");
 customers[i].name = sc.nextLine();
 System.out.println("Enter customer's contact:");
 customers[i].contact = sc.nextLine();
 }
 System.out.println("------ CUSTOMER DETAILS -----");
 for (int i = 0; i < n; i++) {
 customers[i].displayDetails(i + 1);
 }
 sc.close();
 }
}