import java.util.Scanner;

// Program 01: Maximum sum of Odd or Even Number

public class Day3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();

        if(size<0)
        {
            System.out.println("Invalid array size ");
            return;
        }
        int numbers[]=new int[size];

        for(int i=0;i<size;i++)
        {
            numbers[i]=sc.nextInt();
            if(numbers[i]<0)
            {
                System.out.println("Invalid input");
                return;
            }
        }

        int sumEven=0,sumOdd=0;
        for(int number:numbers)
        {
           if(number%2==0)
                sumEven+=number;
           else 
                sumOdd+=number;
        }
        int maximum= sumEven>=sumOdd ? sumEven: sumOdd;
        
        System.out.println(maximum);
    }
}
