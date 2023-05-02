package bankmang2;
import java.sql.*;


public class Conn {
    
    public Connection c;
    public Statement s;
    public Conn() {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "1234");
            s = c.createStatement();
            int r=s.executeUpdate("Use bank;");
        } catch (Exception e) {
             System.out.println(e);
        }
    }
    
    
    public static void main(String args[]) {
        Conn c=new Conn();
        
    }
    
}