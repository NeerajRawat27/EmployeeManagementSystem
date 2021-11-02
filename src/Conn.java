
import java.sql.*;

class Conn {
   
    public Connection c;
    public Statement s;
    
    public Conn()
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","rawat");
            s=c.createStatement(); 
        	}
        	catch (Exception ex) {
            System.out.println(ex);;
        }
        
    }
    }

