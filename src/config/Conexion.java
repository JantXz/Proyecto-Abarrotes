
package config;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection con;
    
    
    public Conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventario","root","123456789");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Conexion fallida: "+e,"Conexion",JOptionPane.ERROR_MESSAGE);
        }
        
    }// end method
    
    public Connection getConnection(){
        return con;
    }
    
    
}//end class
