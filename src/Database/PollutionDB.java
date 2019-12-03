package Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Database.DB_Connection;

public class PollutionDB {
	
	private Connection connection;
	private DB_Connection obj_DB_Connection;
	
	public PollutionDB() {
		DB_Connection obj_DB_Connection=new DB_Connection();
	    connection=obj_DB_Connection.getConnection();
	}
	
	public ResultSet getPollution(){
		ResultSet rs=null;
		try {
			String query = "select * from pollution limit 10";
			PreparedStatement ps=connection.prepareStatement(query);
			rs=ps.executeQuery();			
			while(rs.next()){
				System.out.println(rs.getString("DATE"));
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		}

	    return rs;
	}
	
	public ResultSet getPollutionDataWith(String date, String place) {
		ResultSet rs=null;
		String query;
		PreparedStatement ps;
		try {
			query = "select * from pollution where DATE=? and PLACE=?";
			ps = connection.prepareStatement(query);
			ps.setString(1, date);
			ps.setString(2, place);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs; 
	}
}
