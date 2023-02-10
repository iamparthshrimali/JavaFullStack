public class TwoWheeler extends Vehicle {
   private boolean kickStartAvailable;

   public TwoWheeler()
   {

   }
   public TwoWheeler(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc, boolean kickStartAvailable)
   {
        super(make,vehicleNumber,fuelType,fuelCapacity,cc);
        this.kickStartAvailable=kickStartAvailable;
   }
   public void displayDetailInfo()
   {
        System.out.println("Basic information   ");
        super.displayMake();
        System.out.println("--Detailed information--");
        System.out.print("Kick start available: ");
        if(this.kickStartAvailable)
            System.out.println("Yes");
        else
            System.out.println("No");
   }
}
