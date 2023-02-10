public class Vehicle {
    private String make;
    private String  vechicleNumber;
    private String fuelType;  
    private int fuelCapacity;
    private int cc;

    public Vehicle()
    {

    }
    public Vehicle(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc)
    {
        this.make=make;
        this.vechicleNumber=vehicleNumber;
        this.fuelType=fuelType;
        this.fuelCapacity=fuelCapacity;
        this.cc=cc;
    }

    public void setVehicleNumber(String vehicleNumber)
    {
        this.vechicleNumber=vehicleNumber;
    }
    public void setFuelType(String fuelType)
    {
        this.fuelType=fuelType;
    }

    public void setFuelCapacity(int fuelCapacity)
    {
        this.fuelCapacity=fuelCapacity;
    }
    public void setCc(int cc)
    {
        this.cc=cc;
    }

    public String getVehicleNumber()
    {
       return this.vechicleNumber;
    }
    public String getFuelType()
    {
       return this.fuelType;
    }

    public int getFuelCapacity()
    {
        return this.fuelCapacity;
    }
    public int getCc()
    {
          return this.cc;
    }

    public void displayMake()
    {
        
        System.out.println("***"+this.make+"***");
        System.out.println("Vechicle number: "+ this.vechicleNumber);
        System.out.println("Fuel type: "+this.fuelType);
        System.out.println(" fuel Capactity : "+ this.fuelCapacity);
        System.out.println("CC: "+this.cc);
    }

}
