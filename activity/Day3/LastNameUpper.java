import java.util.Scanner;
public class LastNameUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your full name : ");
        String fullName=sc.nextLine();
        String firstName=fullName.split("\\s")[0];
        String lastName=fullName.split("\\s")[1];
        System.out.println("Your name is "+firstName+" "+ lastName.toUpperCase());
    }
}
