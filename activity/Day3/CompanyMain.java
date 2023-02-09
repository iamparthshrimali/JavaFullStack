import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

class Company
{
    private String name;
    private String employees;
    private String teamlead;

    public Company(String name, String employees, String teamlead)
    {
        this.name=name;
        this.employees=employees;
        this.teamlead=teamlead;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void setEmployees(String employees)
    {
        this.employees=employees;
    }
    public void setTeamlead(String teamlead)
    {
        this.teamlead=teamlead;
    }

    public String getName()
    {
        return this.name;
    }

    
    public String getTeamlead()
    {
        return this.teamlead;
    }
    
    public String getEmployees()
    {
        return this.employees;
    }

    public void displayCompanyDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Employees : " + this.employees);
        System.out.println("Lead "+ this.teamlead);

    }

}
public class CompanyMain {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the Company name :");
        String name=sc.nextLine();
        System.out.println("Enter the employees: ");
        String employees=sc.nextLine().toLowerCase();
        System.out.println("Enter the team lead: ");
        String teamlead=sc.nextLine().toLowerCase();

        Company company;
        for(String employee:employees.split(","))
        {
            if(employee.equals(teamlead)) 
            { 
                company=new Company(name, employees, teamlead);
                company.displayCompanyDetails();
                return;
            }        
        }
        System.out.println("Invalid input");
    }
    
}
