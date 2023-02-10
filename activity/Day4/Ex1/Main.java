import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("1.Four Wheeler ");
        System.out.println("2.Two Wheeler");
        System.out.println("Enter vehicle type");
        int choice=sc.nextInt();
        System.out.println("Vehicle make:");
        String make=sc.next();
        System.out.println("vehicle number");
        String vechicleNumber=sc.next();
        System.out.println("Fuel type");
        String fuelType=sc.next();
        System.out.println("fuel capacity: ");
        int fuelCapacity=sc.nextInt();
        System.out.println("CC: ");
        int cc=sc.nextInt();
        
        switch(choice)
        {
            
            case 1: //Four wheeler
                System.out.println("Audio system: ");
                String audioSystem=sc.next();
                System.out.println("Number of doors: ");
                int numberOfDoors=sc.nextInt();
                FourWheeler fourWheeler=new FourWheeler(make, vechicleNumber, fuelType, fuelCapacity, cc, audioSystem, numberOfDoors);
                fourWheeler.displayDetailInfo();
                break;
            case 2: //two wheeler
     
            System.out.println("Is kick start available: Y/N");
            String kickStartAvailable=sc.next();
            TwoWheeler twoWheeler;
            if(kickStartAvailable.toLowerCase().equals("y"))
                 twoWheeler=new TwoWheeler(make, vechicleNumber, fuelType, fuelCapacity, cc, true);
            else 
                twoWheeler=new TwoWheeler(make, vechicleNumber, fuelType, fuelCapacity, cc, false);
                twoWheeler.displayDetailInfo();
                break;
        }
    }
}