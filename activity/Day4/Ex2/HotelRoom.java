public class HotelRoom
{
    protected String hotelName;
    protected Integer numberOfSqFeet;
    protected boolean hasTV;
    protected boolean hasWifi;
    public HotelRoom()
    {
            
    }
    public HotelRoom(String hotelName,Integer numberOfSqFeet,boolean hasTV,boolean hasWifi)
    {
        this.hotelName=hotelName;
        this.numberOfSqFeet=numberOfSqFeet;
        this.hasTV=hasTV;
        this.hasWifi=hasWifi;
    }

    public int calculateTariff(int costPerSqFeets)
    {
        return this.numberOfSqFeet*costPerSqFeets;
    }

    public int getRatePerSqFeet()
    {
        return 0;
    }


}