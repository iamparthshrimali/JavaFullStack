import java.util.Scanner;
public class Day2_2
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number: ");
      int number=sc.nextInt();
      if(number<0)  
        System.out.println("The number is too small");
      else if(number>32767)
        System.out.print("The number is too large");
      else
      {
        while(number%2==0)
            number=(number/2);
        if(number==1)
            System.out.print("Yes");
        else
            System.out.print("No");
      }
    }
}