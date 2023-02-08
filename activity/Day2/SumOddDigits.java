import java.util.Scanner;

public class SumOddDigits {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number=sc.nextInt();
        if(number>32767 || number<0)
        {
            System.out.println("Invalid input");
            return;
        }
        
        int temp=number;
        int sum=0;
        while(temp!=0)
        {
            int digit=temp%10;
            if(digit%2!=0)
                sum+=digit;
            temp=temp/10;
        }
        System.out.println(sum);
    }

}
