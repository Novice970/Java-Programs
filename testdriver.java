import java.sql.*;
public class testdriver{
    public static void main(String[] args){
        try{
            Driver d= (Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("connection works");
        }
        catch(Exception e){
            System.out.println("connection failed");
            e.getStackTrace(); 
        }
    }
}