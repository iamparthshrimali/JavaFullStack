import java.util.Scanner;



public class EmployeeMain {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Employee employee = new Employee();

            System.out.println("Enter the name: ");
            String name=sc.nextLine();
            employee.setName(name);

            System.out.println("Enter Address: ");
            String address=sc.nextLine();
            employee.setAddress(address);

            System.out.println("Enter mobile: ");
            String mobile=sc.nextLine();
            employee.setMobile(mobile);

            System.out.println("Employee details: ");
            employee.displayEmployeeDetails();

        }
}
