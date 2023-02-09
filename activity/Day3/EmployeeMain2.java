import java.util.Scanner;

public class EmployeeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Enter the name: ");
        String name = sc.next();
        employee.setName(name);

        System.out.println("Enter Address: ");
        String address = sc.next();
        employee.setAddress(address);

        System.out.println("Enter mobile: ");
        String mobile = sc.next();
        employee.setMobile(mobile);

        System.out.println("Menu");
        int choice = 0;
        while (choice != 4) {
            employee.displayEmployeeDetails();
            System.out.println("Menu");
            System.out.println("1. Update Employee name");
            System.out.println("2. Update Employee Address");
            System.out.println("3. Update Employee mobile");
            System.out.println("4. All information correct/Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current name: " + employee.getName());
                    System.out.println("Enter new name: ");
                    String newName = sc.next();
                    employee.setName(newName);
                    break;
                case 2:
                    System.out.println("Current Address: " + employee.getAddress());
                    System.out.println("Enter new address: ");
                    String newAddress = sc.next();
                    employee.setAddress(newAddress);
                    break;
                case 3:
                    System.out.println("Current name: " + employee.getMobile());
                    System.out.println("Enter new mobileNo: ");
                    String newMobile = sc.next();
                    employee.setMobile(newMobile);
                    break;
                case 4:
                    System.out.println("The details are: ");
                    employee.displayEmployeeDetails();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
