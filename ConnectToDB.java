import java.sql.*;
import java.util.Scanner;

public class ConnectToDB{
    public static void main(String[] args) throws Exception{
        Connection conn=null;
        String userName="puneet";
        String password="null";
        String url="jdbc:mysql://localhost/colors";
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        conn=DriverManager.getConnection(url,userName,password);
        //System.out.println("databse connection successful");
       /* Statement stmt;
        String query;
        Scanner input= new Scanner(System.in);
        System.out.println("entre the query:");
        query=input.nextLine();
        
        ResultSet rset= null;
        stmt=conn.createStatement();
        if( !query.substring(0,6).equals("select")){
           int j= stmt.executeUpdate(query);
        }
        else{
        rset=stmt.executeQuery(query);
        
        while(rset.next()){
            String name=rset.getString("name");
            String value=rset.getString("value");
            System.out.println(name);
            System.out.println(value);
            
        }
        }
        conn.close();
        System.out.println("the connection is closed");*/
        
        
    }
}