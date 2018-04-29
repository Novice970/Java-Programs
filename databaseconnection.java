import java.sql.*;

public class databaseconnection{
    public static void main(String[] args) throws Exception{
        Connection  conn=null;
        String username="puneet";
        String password="null";
         String url="jdbc:mysql://localhost/colors";
        Class.forName("com.mysql.jdbc.Driver").newInstance();
       
        conn=DriverManager.getConnection(url,username,password);
    }
}