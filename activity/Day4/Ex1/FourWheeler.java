public class FourWheeler extends Vehicle {
     private String audioSystem;
     private int numberOfDoors;

     public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
               String audioSystem, int numberOfDoors) {
          super(make, vehicleNumber, fuelType, fuelCapacity, cc);
          this.audioSystem = audioSystem;
          this.numberOfDoors = numberOfDoors;
     }

     public void displayDetailInfo() {
          System.out.println("Basic information   ");

          super.displayMake();
          System.out.println("--Detailed information--");
          System.out.println("Audio system : " + audioSystem);
          System.out.println("Number of doors: " + numberOfDoors);
     }
}
