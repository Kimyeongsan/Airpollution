package Database;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


 public class Create_CSV {
 public static void main(String[] args) {
 
   try {
    PrintWriter pw= new PrintWriter(new File("C:\\Users\\YeongSan\\Desktop\\Pollution.CSV"));
    StringBuilder sb=new StringBuilder();
 
 
    Connection connection=null;
    DB_Connection obj_DB_Connection=new DB_Connection();
    connection=obj_DB_Connection.getConnection();
    ResultSet rs=null;
 
    String query="select * from pollution";
    PreparedStatement ps=connection.prepareStatement(query);
    rs=ps.executeQuery();
 
    while(rs.next()){
     sb.append(rs.getString("DATE"));
     sb.append(","); 
     sb.append(rs.getString("PLACE"));
     sb.append(",");
     sb.append(rs.getString("NO2"));
     sb.append(",");
     sb.append(rs.getString("O3"));
     sb.append(",");
     sb.append(rs.getString("SO2"));
     sb.append(",");
     sb.append(rs.getString("FINEDUST"));
     sb.append(",");
     sb.append(rs.getString("TINYDUST"));
     sb.append("\r\n");
    }
 
    pw.write(sb.toString());
    pw.close();
    System.out.println("finished");
 
   } catch (Exception e) {
    // TODO: handle exception
   } 
 }
}