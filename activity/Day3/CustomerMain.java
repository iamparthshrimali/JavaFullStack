 import java.util.Scanner;;
 class Customer {
    private String name;
    private String address;
    private String mobile;

    public Customer(String name, String address, String mobile)
    {
        this.name=name;
        this.address=address;
        this.mobile=mobile;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setMobile(String mobile)
    {
        this.mobile=mobile;
    }

    public String getName()
    {
        return this.name;
    }

    
    public String getMobile()
    {
        return this.mobile;
    }
    
    public String getAddress()
    {
        return this.address;
    }

}

public class CustomerMain
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Details: ");
        String details[]=sc.nextLine().split(",");
        if(details.length!=3)
        {
            System.out.println("Invalid input");
            return;
        }
        Customer customer=new Customer(details[0], details[1], details[2]);
        
         System.out.println("Customer details: ");
            System.out.println("Name: "+customer.getName());
            System.out.println("Address: "+customer.getAddress());
            System.out.println("Mobile: "+customer.getMobile());
    }
}