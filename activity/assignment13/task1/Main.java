package assignment13.task1;
import java.sql.*;

public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		PlayerDao dao=new PlayerDao();
		for(Player player: dao.getAllPlayers())
		{
			System.out.println(player);
		}
		
		
	}

}
