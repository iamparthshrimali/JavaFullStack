public class DeluxACRoom extends DeluxRoom
{
    public DeluxACRoom()
    {

    }
    public DeluxACRoom(String hotelName,Integer numberOfSqFeet,boolean hasTV,boolean hasWifi)
    {
        super(hotelName,numberOfSqFeet,hasTV,hasWifi);
        this.ratePerSqFeet=12;
    }

    
}