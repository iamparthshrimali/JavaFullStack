public class DeluxRoom extends HotelRoom {
    int ratePerSqFeet;
    public DeluxRoom()
    {

    }

    public DeluxRoom(String hotelName,Integer numberOfSqFeet,boolean hasTV,boolean hasWifi)
    {
        super(hotelName,numberOfSqFeet,hasTV,hasWifi);
        this.ratePerSqFeet=10;
    }
    public int getRatePerSqFeet()
    {
        if(this.hasWifi)
        {
            this.ratePerSqFeet+=2;
        }
       return this.ratePerSqFeet;
    }

    
    
}
