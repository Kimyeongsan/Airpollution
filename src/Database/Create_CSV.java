package Database;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 public class Create_CSV {
 public static void main(String[] args) {
 
   try {
    PrintWriter pw= new PrintWriter(new File("C:\\Users\\YeongSan\\Desktop\\¿œ∫∞∆Ú±’¥Î±‚ø¿ø∞µµ_2018.CSV"));
    StringBuilder sb=new StringBuilder();
 
 
    Connection connection=null;
    DB_Connection obj_DB_Connection=new DB_Connection();
    connection=obj_DB_Connection.getConnection();
    ResultSet rs=null;
 
    String query="select * from books";
    PreparedStatement ps=connection.prepareStatement(query);
    rs=ps.executeQuery();
 
    while(rs.next()){
     sb.append(rs.getString("book_sl_no"));
     sb.append(","); 
     sb.append(rs.getString("book_title"));
     sb.append(",");
     sb.append(rs.getString("category_name"));
     sb.append(",");
     sb.append(rs.getString("author_name"));
     sb.append(",");
     sb.append(rs.getString("publisher_name"));
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