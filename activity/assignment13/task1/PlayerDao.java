package assignment13.task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerDao {
	private static Connection makeConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/assignment13", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public List<Player> getAllPlayers()
	{
		List<Player> li=new ArrayList<Player>();
		Connection con=makeConnection();
		if(con==null)
			return li;
		
		String query="select * from player";
		try {
			Statement st=con.createStatement();
			ResultSet resultSet=st.executeQuery(query);
			while(resultSet.next()) {
				li.add(new Player(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return li;
	
		
	}
}
